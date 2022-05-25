## Encapsulation

- Encapsulation is defined as the wrapping up of data under a single
  unit.
- It is the mechanism that binds together code and the data it
  manipulates.
- Technically in encapsulation, the variables or data of a class is hidden
  from any other class and can be accessed only through any member
  function of its own class in which it is declared.
- Encapsulation can be achieved by Declaring all the variables in the
  class as private and writing public methods in the class to set and get
  the values of variables
- It is more defined with setter and getter method.

## **Example:**

```java
class User{
    private String name;
    private String password;

    // Setter for acessing the private object
    public void setName(String name){
        this.name = name;
    }

    // Getter for acessing private object
    public String getName(){
        return this.name;
    }

    // Setter for acessing the private object
    public void setPassword(String password){
        this.password = password;
    }

    // Getter for acessing private object
    public String getPassword(){
        return this.password;
    }
}
```

Here the variables like username and password are encapsulated in the code. We use setter and getter methods to access the variables.
