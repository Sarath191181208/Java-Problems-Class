import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class prob28 {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Token> blockingQueue = new LinkedBlockingQueue<>();

        TokenVendingMachine tokenVendingMachine = new TokenVendingMachine(blockingQueue);
        new Thread(tokenVendingMachine).start();
        CountDownLatch countDownLatch = new CountDownLatch(100);

        TokenServingCounter tokenConsumer = new TokenServingCounter(blockingQueue,
                countDownLatch);
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 5; i++) {
            executor.submit(tokenConsumer);
        }
        countDownLatch.await();
        System.out.println("Stopped");
        executor.shutdown();
    }
}

class TokenVendingMachine implements Runnable {

    private BlockingQueue<Token> blockingQueue;

    public TokenVendingMachine(BlockingQueue<Token> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            Token token = new Token();
            token.setId(UUID.randomUUID());
            token.setNumber(i);
            token.setDescription("Some Description");

            try {
                System.out.println("New token issued :" + token);
                blockingQueue.put(token);
            } catch (InterruptedException e) {
            }
        }
    }
}

class TokenServingCounter implements Runnable {

    private BlockingQueue<Token> blockingQueue;
    private CountDownLatch countDownLatch;

    public TokenServingCounter(BlockingQueue<Token> blockingQueue,
            CountDownLatch countDownLatch) {
        this.blockingQueue = blockingQueue;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        while (true) {
            if (countDownLatch.getCount() == 0) {
                break;
            }
            try {
                Token token = blockingQueue.take();
                System.out.println("Serving Token :" + token);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        }
    }
}

class Token {

    private UUID id;
    private int number;
    private String description;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Token [id=" + id + ", number=" + number + ", description=" + description + "]";
    }
}