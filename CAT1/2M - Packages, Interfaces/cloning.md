# Cloning

- The clone() method saves the extra processing task for creating the
  exact copy of an object.
- If we perform it by using the new keyword, it will take a lot of processing time to be performed that is why we use object cloning.

```java
class Object implements Cloneable { }


public class Main {
    public static void main(String args[])
        throws CloneNotSupportedException
    {
        Object obj = new Object();
        Object obj1 = obj.clone();
        System.out.println(obj == obj1);
    }
}
```
