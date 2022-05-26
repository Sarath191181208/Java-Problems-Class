# Method Overloading

- Can be used when the task is same but the number of params differ/ change in data type.
- **Note:**

  - Method Overloading is not applicable to methods differing by static keyword.

  - Isn't applicable when the return type changes, becuase of change in signature.

```java
class Ex1{
    public static void main(String[] main){
        printOne(1);
        printTwo(1,2);
    }

    public static void printOne(int a){
        System.out.println("int");
    }

    public static void printTwo(int a, int b){
        System.out.println("int, int");
    }
}
```

---

```java
class Ex2{
    public static void main(String[] main){
        sumOne(1);
        sumTwo(1.0,2.0);
    }

    public static void sumOne(int a){
        System.out.println("int");
    }

    public static void sumTwo(double a, double b){
        System.out.println("double, double");
    }
}
```

This is precisely where we need to use the concept of method overloading.

```java
class Main{
    public static void main(String[] main){
        print(1);
        print(1,2.0);
    }

    public static void print(int a){
        System.out.println("int");
    }

    public static void print(int a, double b){
        System.out.println("int, double");
    }
}
```
