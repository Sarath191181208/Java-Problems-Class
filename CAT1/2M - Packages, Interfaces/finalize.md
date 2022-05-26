# Finalize

- This method is called just before an object is garbage collected.
- It is called the Garbage Collector on an object when the garbage collector determines that there are no more references to the object.
- We should override finalize() method to dispose of system resources, perform clean-up activities and minimize memory leaks.
- -For example, before destroying Servlet objects web container, always called finalize method to perform clean-up activities of the session.

```java
public class Main {
    public static void main(String[] args){
        Main obj = new Main();
        System.out.println(obj.hashCode());
        obj = null;

        // calling garbage collector
        System.gc();
    }

    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}
```
