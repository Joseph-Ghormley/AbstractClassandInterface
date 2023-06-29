# Banking Application

This is a simple banking application that allows you to perform transactions and calculate interest rates for different banks. The application demonstrates the use of abstract classes and interfaces in Java.

## Code Structure

The code is divided into two parts: Part I and Part II.

### Part I: Using Abstract Class

In Part I, an abstract class called `Bank` is defined. It contains two methods, `withdraw()` and `deposit()`, which handle the withdrawal and deposit transactions respectively. Additionally, the abstract method `calculateInterest()` is defined, which needs to be implemented by subclasses.

Two concrete classes, `PNC` and `AMT`, inherit from the `Bank` abstract class. They override the `calculateInterest()` method and provide specific implementations for calculating interest rates.

### Part II: Using Interface

In Part II, an interface called `BankInterface` is defined. It declares three methods: `withdraw()`, `deposit()`, and `calculateInterest()`. Classes implementing this interface are required to provide implementations for these methods.

Two classes, `BOA` and `Chase`, implement the `BankInterface`. They override the interface methods and provide specific implementations for handling transactions and calculating interest rates.

## Running the Application

To run the application, follow these steps:

1. Compile the Java files using the Java compiler.
2. Run the compiled program.
3. The output will display the transactions and interest rates for each bank, according to the code implementation.

## Expected Output

The expected output of the program will be as follows:

------------------------------------------<br>
PNC BANK TRANSACTION<br>
Amount deposited<br>
Amount withdraw<br>
PNC interest rate is 5%<br>
--------------------------------<br>
AMT BANK TRANSACTION<br>
Amount deposited<br>
Amount withdraw<br>
AMT interest rate is 3%<br>
------------------------------------------<br>
End of Abstract Class<br>
------------------------------------------<br>
Transaction Details Using INTERFACE<br>
------------------------------------------<br>
amount deposited to BAC<br>
amount withdraw from BAC<br>
The interest rate is 5%<br>
------------------------------------------<br>
Chase BANK TRANSACTION<br>
amount deposited to Chase<br>
amount withdraw from Chase<br>
The interest rate is 10%<br>
---------------------------------<br>
End of INTERFACE<br>
------------------------------------------<br>

Process finished with exit code 0



