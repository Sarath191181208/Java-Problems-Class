This is the solutions to the lab problems given in VIT-AP 2nd sem, Including some additional given by the instructor.

## Lab Problems

1. Write a Java Program to define a class, describe its constructor, overload the Constructors
   and instantiate its object
2. Write a Java Program to define a class, define instance methods for setting and Retrieving
   values of instance variables and instantiate its object
3. Write a Java Program to define a class, define instance methods and overload them and use
   them for dynamic method invocation
4. Write a Java Program to implement array of objects
5. Write a Java Program to implement Wrapper classes and their methods.
6. Write a Java Program to implement inheritance and demonstrate use of method overriding.
7. Write a Java Program to implement multilevel inheritance by applying various access
   controls to its data members and methods. \*
8. Write a Java program to demonstrate use of implementing interfaces.
9. Write a Java program to implement the concept of importing classes from user defined
   package and creating packages
10. Write a program to implement the concept of threading by implementing Runnable Interface
11. Write a Java program to implement the concept of Exception Handling using predefined
    exception.
12. Write a Java program to implement the concept of Exception Handling by creating user defined exceptions.
13. Write a Java program using Collections
14. Write a Java Program using Generics
15. Write a Java Program to implement multi-threading.
16. Write a Java Program to implement Synchronization.
17. Write a Java Program to implement inter thread communication.

### GUI Problems

18. Programs using JavaFX canvas.
19. The following JavaFX GUI counter contains 3 controls (or components): a Label, a Text Field and a Button.
    Clicking the button increases the count displayed in the text field.
20. Write a JavaFX program that works as a simple calculator.
    Use a grid layout to arrange buttons for the digits and for the +, -, \*, % operations.
    Add a text field to display the result. Handle any possible exceptions like divide by zero.
21. Write a JavaFX program that creates a menu.

- Assignment Problems

31. Design a Java FX application for designing an application for taking a quiz online
    which has at least one question and four radio buttons for choices or answers and
    there should also be a button called submit to submit the answer?

### Digital Assignment

1. Develop a java program to implement List interface by using stack class and linkedlist classes. (It should include all the methods of List interface).
2. Develp a java program to implement Set interface by using TreeSet class and EnumSet class.
3. Develp a java program to implement queue interface by using ArrayDeque class and LinkedList class and priority queue class.

### Assignment Problems

#### Questions on Generics:

22. Create two classes called CompAEmp and CompBEmp extending Emp class. Create a
    generic class called MyEmployeeUtil, which defines utilities to perform employee
    functions irrespective of which comapany emp belogns too. This class accepts
    subclasses of Emp. Compare the salary of two employees using MyEmployeeUtil
    class.

23. Create a class Complex which has real and imaginary values represents the
    numeric values. The class has one parametrized constructor to initialize real and
    imaginary part of complex number. The generic class Complex implements in-built
    interface Comparable. Write the java program to find bigger complex number from
    the pair of complex number using comparable interface.

24. Bob want to search a particular number in available list of arranged numeric
    numbers. Will you help him to find a numeric number using java program with the
    concept of generic?

#### Questions on Thread:

25. Creates the 4 threads and achieve the synchronization among threads for following
    tasks.

    - It accepts the multi-digit number
    - Performs the sum of digits of given number until it gets the single digit
      number
    - Calculate the factorial of number which is returned by task b above task.
      Note: For each task define the separate methods.

26. To achieve the parallel execution in multi-threaded environment, we have created
    the 4 threads to perform the given task. The task is to take the string from the user,
    return the maximum occurring character in that string, and then remove all the
    occurrences of the maximum occurring character from string. Implement all given
    task with multi-threaded environment with synchronization among all threads.
    Note: design function for each task.

27. Implement the java program for the following scenario: Generate the multithreaded environment where the Producer generates an integer between 0 and 9
    (inclusive), stores it in a CubbyHole object. To make the synchronization, Producer
    waits for a random amount of time between 0 and 100 milliseconds before
    repeating the number-generating cycle. The Consumer consumes all integers from
    the CubbyHole (the exact same object into which the Producer put the integers in
    the first place) as quickly as they become available.

28. Consider the bank has 5 counters for serving the customers. And the bank serves
    maximum of 100 tokens / day. There is one token vending machine which is
    generating token continuously for each customer. When a customer arrives in bank
    for some work, he /she needs to collect a token from the token vending machine
    (The Producer). Now the customer needs to wait for some time to be served from
    one of the 5 counters (The Consumers)

29. Automatic vending machine is installed for selling of snacks packet in VIT-AP. The
    maximum size of this machine is 1000 packs at a time. If sells manager want to add
    more items (more than 1000), it has to wait until there is space for packs
    (Producer). Then there is no item in vending student has to wait until the sales
    manager puts items into the machine (Consumer).

30. Consider the automatic parking slot of VIT-AP. In the institute parking slots we can
    park maximum 200 vehicle at time. There is automated system which displays
    parking place for each vehicle which are entering inside the campus of VIT-AP.
    When vehicle enters inside the campus, it needs to check the display to get the free
    slot for parking (The Producer). Vehicle has to be wait for some time to get the
    parking slot if slot is completely filled.

    > Didn't quite understand the flow should ask for confirmation of exec flow.
