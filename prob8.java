public class prob8 {
    /**
     * Q: Interfaces implementation
     */
    public static void main(String[] args) {
        SmartPhone myPhn = new SmartPhone();

        myPhn.powerOn();
        myPhn.call("1234567890");
        myPhn.powerOff();
        myPhn.call("1234567890");
    }
}

interface mobileSkeleton {
    void powerOn();

    void call(String num);

    void powerOff();
}

class SmartPhone implements mobileSkeleton {

    private boolean isOn = false;

    @Override
    public void powerOn() {
        System.out.println("SmartPhone is on");
        isOn = true;
    }

    @Override
    public void powerOff() {
        System.out.println("SmartPhone is off");
        isOn = false;
    }

    @Override
    public void call(String num) {
        if (isOn) {
            System.out.println("Calling " + num);
        } else {
            System.out.println("SmartPhone is off Switch it on");
        }

    }

}