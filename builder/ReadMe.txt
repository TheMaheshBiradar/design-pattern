Builder Pattern Implementation

1.Create a class with all the attributes ,getters and setters .

2.Create a static nested class and then copy all the arguments from the outer class to the Builder class. 

3.Follow the naming convention and if the class name is Equity then builder class should be named as EquityBuilder.

4.The Builder class should have a public constructor with all the REQUIRED/MANDATORY attributes as parameters.

5.Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attributes.

6.Last step is to provide a build() method in the builder class that will return the Object needed by Caller. 

7.Make sure that you have provided a private constructor in the outer class with Builder class as argument


