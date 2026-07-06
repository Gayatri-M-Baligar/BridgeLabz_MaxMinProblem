# Java Generics Assignment

## Overview

This project contains the implementation of different use cases and refactoring tasks based on Java Generics. The objective of the assignment is to understand how generics can be used to write reusable and type-safe code for finding the maximum value among different data types.

The programs are implemented using Java Generics, `Comparable` interface, generic methods, and generic classes.

---

## Concepts Used

- Java Generics
- Generic Methods
- Generic Classes
- Comparable Interface
- Constructors
- Method Overloading
- Varargs
- Arrays.sort()
- Object-Oriented Programming (OOP)

---

## Use Cases Implemented

### UC1
- Find the maximum of three Integer values using Generics.
- Implemented using the `compareTo()` method.

### UC2
- Test the program with the maximum number in the first position.

### UC3
- Test the program with the maximum number in the second position.

### UC4
- Test the program with the maximum number in the third position.

### UC5
- Find the maximum among three Float values.

### UC6
- Find the maximum among three String values.

### Refactor 1
- Refactored the program to use a single generic method for all data types.

### Refactor 2
- Created a Generic Class with a parameterized constructor.
- Implemented the `testMaximum()` method.

### UC4 (Varargs)
- Extended the generic method to accept more than three parameters.
- Used `Arrays.sort()` to determine the maximum value.

### UC5 (printMax)
- Added a generic `printMax()` method.
- The `testMaximum()` method internally calls `printMax()` to display the maximum value.

---

## Project Structure

```
Generics
│
├── Max_MinUc1.java
├── Max_MinUc1Tc1.java
├── Max_MinUc1Tc2.java
├── Max_MinUc1Tc3.java
├── Max_MinUc2.java
├── Max_MinUc3.java
├── Max_MinRefactor1.java
├── Max_MinRefactor2.java
├── Max_MinUc4.java
└── Max_MinUc5.java
```

---

## How to Run

1. Open the project in Eclipse or any Java IDE.
2. Compile the required Java file.
3. Run the program.
4. Observe the output for different test cases.

---

## Learning Outcomes

Through this assignment, I learned:

- How Java Generics improve code reusability.
- The use of the `Comparable` interface for comparing objects.
- Difference between Generic Methods and Generic Classes.
- How to implement parameterized constructors.
- How to use varargs with Generics.
- How to write reusable and type-safe programs.

---

## Author

**Shreya Kambar**
