# Classes.

- This is a user defined blueprint or prototype fro which objects are created, it represents the set of properties or methods that are common to all objects of one type.

- Using classes we can create multiple objects with the same behavior instead of writing their code multiple times.

## Abstraction.

- Data Abstraction is the process of identifying only the required characteristsics of an object, ignoring the irrelevant details. In java abstraction is achieved by `interfaces` and `abstract classes`.

1. Abstract methods are declared without implementation.
2. Abstract methods must always be redefined in the subclass, thus making overriding compulsory or the subclass itself can be abstract.
3. There can be no object of an abstract class. The abstract class can not be directly instantiated with the `new` operator.
4. An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.


## Encapsulation.
- This is a principle that combines daa and methods in a class. Allows implementation details to be hidden while exposing a public interface for interaction.

- The variables or data of a class are hidden from any ather class and can be accessed only through any member function of its own class.

- A private class can hide its members or methods from the end user, using abstraction to hide implementation details, by `combining data hiding` and `abstraction`.

- Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
