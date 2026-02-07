# Java Training - JAN 2026

A comprehensive learning repository documenting Java fundamentals, object-oriented programming, data structures, and advanced concepts.

## 📋 Table of Contents

- [Introduction](#introduction)
- [Language Types](#language-types)
- [Program Execution Flow](#program-execution-flow)
- [Core Concepts](#core-concepts)
  - [Tokens & Identifiers](#tokens--identifiers)
  - [Data Types](#data-types)
  - [Operators](#operators)
  - [Decision & Looping Statements](#decision--looping-statements)
  - [Methods](#methods)
  - [Objects & Classes](#objects--classes)
  - [Inheritance & Polymorphism](#inheritance--polymorphism)
  - [Collections](#collections)
  - [Wrapper Classes](#wrapper-classes)
- [Project Structure](#project-structure)

## Introduction

This repository contains practical Java training materials covering beginner to intermediate concepts. Each topic includes theoretical explanations and practical code examples organized by folder.

---

## Language Types 

High-Language that easy understandable and executable by programmer  (High level of abstraction)

Mid 

Low 

Assembler- Converts assembly language to machine code

Flow -

- **`.java` file**
    
    → Written by the programmer.
    
- **Java Compiler (`javac`)**
    
    → Compiles `.java` into **`.class` file**
    
    → This `.class` file contains **byte-code**.
    
- **JVM (Java Virtual Machine)**
    - Loads the byte-code
    - **Interprets and/or JIT-compiles** the byte-code into **native machine code**
    - Executes it on the host system
    
    ## Structure of java
    
    Naming Convention follows starting of class-name with an capital alphabet.
    
    for variables it follows starting with an small letter
    
    variable → A named memory location or named block of memory 
    
    Identifier → Used to identify an programming element 
    
    Method → set of instruction associated with the class. cant be independently called
    
    Function → set of instruction that can be directly invoked without need to call the class
    

Ex. For searching in search box — We consider the search button to be a method and whats written in the search box to be considered as a variable 

## Print and Println Difference

1. Cursor moves to Next Line after printing in println
2. At-least one parameter is required for print or else you will face compile time error

## JVM calls the main method hence main method is mandatory

## We can compile class without main method but cant execute it

## Public static void main (String [] args)

- **public** → Makes the `main` method accessible to the JVM from anywhere.
- **static** → Allows the JVM to call the method without creating an object of the class.
- **void** → Specifies that the method does not return any value.
- **main** → The special method name that the JVM looks for to start program execution.
- **String[]** → Represents an array of strings used to receive command-line arguments.
- **args** → The variable name that stores the command-line arguments passed to the program.

## Token

Token is the smallest unit of programming language

Literals, Keywords and Identifiers 

- **Keyword** → A reserved word in a programming language that has a predefined meaning and cannot be used as a name (e.g., public, class, static).
- **Identifier** → A user-defined name used to identify program elements such as variables, methods, classes, or objects (e.g., count, main, student).
- **Literal** → A fixed value written directly in the source code that represents constant data (e.g., 10, 3.14, ‘a’, “hello”,Boolean literal - true , false).

## Rules of Identifier Nomenclature

- Cant start with number
- Cant use keyword
- Can only use _,$

## Single line comment - //

## Multi line comment - /*    */

- With the help of variable we can update the data

## Primitive variable

A variable that stores primitive data

ex. int a=10;

## Data type - Which type of data to store

Types of Datatype 

| Data Type | Size | Range |
| --- | --- | --- |
| `byte` | 1 byte (8 bits) | −128 to 127 |
| `short` | 2 bytes (16 bits) | −32,768 to 32,767 |
| `int` | 4 bytes (32 bits) | −2³¹ to 2³¹−1 |
| `long` | 8 bytes (64 bits) | −2⁶³ to 2⁶³−1 |
| `float` | 4 bytes (32 bits) | ~6–7 decimal digits |
| `double` | 8 bytes (64 bits) | ~15–16 decimal digits |
| `char` | 2 bytes (16 bits) | 0 to 65,535 (Unicode) |
| `boolean` | JVM-dependent (typically 1 byte) | `true` / `false` |

## Non Primitive data type

Non primitive datatype is data type created by user and we can store NULL or Object reference to it 

If we try to use primitive data then we will get incompatible type 

# Operators

Operators return value of data and datatype

## Precedence of Operators

Which Operator has more priority 

Types of Operator 

Operators are classified into two types 

- Based on task
    - Arithmetic
        - We have Addition,Subtraction,Division,Modulus,Multiplication
        - Addition operator is polymorphic in nature
            - It can used both for concatenation as well as addition
            - “a”+5+5 =”a55”
            - 5+5+’a’+”a”+”a”=108aa
    - Relational
        - Used for comparison of two variables
        - ==,! =,≥,≤,<,>
    - Bit-wise
        - Used to Operate on individual bits
        - &,^,|,~,<<,>>
        - ~(-37) =36
    - Compound Assignment
        - +=,-=,%=,*=
    - Logical
        
        Only Returns Boolean data and Only works with Boolean Operators
        
        - Logical AND - Return True if both Conditions are true
        - Logical OR - Returns True if either of the Conditions are true
        - Logical NOT - Returns False if given True
    - Increment
        - Pre-Increment - (++a or —a)
        - Post-Increment-(a++ or a—)
    - Ternary
        - "Result:"+((1>2) ? 5 : 10)  Output :10
- Based on Operand
    - Unary
    - Binary
    - Ternary

Operands are variable/value on which we do the operation

# Decision Statements

## If

- Decision Statement with one condition check If that condition is true then the block of code is executed if false nothing in it is executed

## If Else

- We have an set of code for true if its false we have separate set of statements

## If Else If

- If multiple condition check

## Switch

- switch is a cleaner alternative to if-else if **only when checking one value against fixed constants**.

# Looping Statements

## For Loop

- for(int i=0;i<n;i++)

## While Loop

- while(i>10)

## Do While

- do{
}while(i>10)

## Nested Loop

- for(int i=0;i<n;i++){
    - for(int j=0;j<n;j++){
        
        }
        
    
    }
    

# Scanner Class

Scanner class is a non static method. whenever user is using Scanner he should import util package 

Scanner is a non primitive datatype   

We need a Scanner variable to call Non Static Method 

## Type Casting

Process of converting one datatype to another datatype

- Primitive type casting
    - Wideing - Process of converting small datatype to larger datatype.Its done implicitly by compiler only
        
        Character - ASCII
        
        0-48
        
        9-57
        
        A-65
        
        Z-90 
        
        a-97
        
        z-122 
        
        When we try to type cast any character even “ “ into int we will get the ASCII value of that character 
        
        When we try to store larger type into smaller container or type we get type mismatch error . ex.Long cant be converted to int 
        
    - Narrowing -Process of converting larger datatype to smaller datatype. Its done explicitly done by compiler (Forced to do)
        - Using (int) a; //Type cast method
        - Whenever we do Explicit type casting the output might be unpredictable
- Non Primitive type casting

# Methods

Methods are block of code used for code reusability.

 public static void method_name(int,int){

statements

}

We can call a method n number of times 

we cannot have an method inside a method (NO NESTED METHOD)

Access Modifier are of two types

- Public
- Private
- Protected
- Default

Non-Access Modifier 

- Static
- Abstract
- Final
- Transient
- Synchronised

## Return Type

Type of data the method returns

ex. We use int to make the method return integer data

- Primitive type
    - Byte
    - Short
    - int
    - double
    - character
    - float
    - long
- Non primitive type
    - Array
    - String
    - etc
- Void --we don’t want to return anything

## Types of Methods -

- Based on Argument
    - No Argument
    - Parameterised Method
    - Variable Argument Method
- Based on Access Modifier
    - Static Method
        - A method which is Prefix with static modifier that method is called a static method
        - static method is a class label method
        - if we wanted to call static method in a same class we can call
            - We can call directly as a method name
            - We can call class name as a reference
        - If we want to static method in same class we can call with
            
            object reference.methodname
            
        - If we want to call static method from another class we have to class name as a reference or particular class object reference
    - Non Static Method etc.
        - A Method that is not prefix with Static modifier is an Non Static Method
        - A non Static method is  a object level method
        - for calling non static method anyhow we have to create an object
        - with the help of reference variable we can access non static method
        - If we wanted to access non static method from another class we have to create object of that particular class
        - Acess_Modifier return_type methodname(){
            
            }
            

## Characteristics of Method

- When we can the method only then method will be called
- We can create Multiple methods
- we cant create Method inside Method

## How to call a method

Methodname();

- Flow of Method :
    - JVM Creates a stack
    - When an method is called it will create a new stack frame
    - this stack frame will be destroyed of that method returns value

## Based on Argument

- No Argument Method
    
     - Method that does not accept any data 
    
- Parameterized Argument
    - We are passing variables to the method
    - The value that we have in declaration of method is formal argument
    - the value we pass to the method is the actual argument
    - We can pass multiple data at a time
        - Number of actual and formal argument should be the same

## Method Overloading

If a class having multiple method having a same name but different parameters that is called as method overloading.

## Method Binding

Method Binding always follows Widening 

When we dont have method for char it will call for int 

It always gives highest priority to int container so if we want to call we should mention byte 

## Method accepting Object Reference

Method that takes input that is a Object Reference

## Method Returning Object Reference

Method that returns Object Reference.

# Data Structures

## Array

Array is an continuous block of memory in that array we can store homogeneous collection of data

- Array are fixed in size

## Syntax of creating an array

Arrays can be created by declaring the type and size. To access the last index use `length-1`.

## For Each loop

for(String i : Names)

## Creating a method that accepts array

— Check code in vs code

## Return Integer array

—Check code in vs code

---

## Objects

 

**An object is an instance of a class that contains data and behavior.**

- An object is a block of memory having multiple variable
- Inside object we can store variable and method
- Every object have some address and reference

---

### Break it down

An object has **two main things**:

1. **Data (properties / variables)** – what it *has*
2. **Behaviour (methods / functions)** – what it *does*

---

### Real-world example

**Car** is a concept → *class*

**Your Honda City** → *object*

Car object has:

- Data: `color`, `speed`, `fuel`
- Behavior: `start()`, `accelerate()`, `brake()`

---

### Object Components

- **Class** → Blueprint for creating objects
- **Object** → Instance of a class
- **Data/Properties** → Variables that store state (e.g., `color`, `speed`)
- **Behavior/Methods** → Functions that define actions (e.g., `drive()`)

---

Syntax of adding object data 

reference var_name=value/variable/exp;

## New

- new is a unary operator
- new is also a keyword
- new creates a bl  ock of memory
- new returns a object reference and its runtime memory allocation

## Constructor

- Constructor is a special member that gets called when an object is created
- Constructor has same name as classname
- work of constructor is to load non static members to object
- 

## Non static variable

Variable that is not prefix with variable is called an non static variable 

## Characteristics of Non Static variable

- Memory is allocated inside an object.
- We cant use non static variable without object creation
- Non static variable is created inside everyobject created
- We can use non static variable with reference object variable
- Non static variables are initialised with default values

## Types of constructor

1. Programmer defined
    1. No Argument Constructor 
        - No argument constructor works same as a default constructor
        - It does not have a formal argument
        - Constructor does not have any return type
    2. Parameterised Constructor  
        - A Constructor that takes parameter to automatically initialise object
2. Default Constructor
    - when programmer fails to create a constructor the compiler creates the constructor
    

## This Keyword

This is a keywords - it holds address of current class

In constructor of formal argument the variable having same name we use this keyword

## Constructor Overloading

If a class having multiple constructor but parameter are different then we say constructor overloading 

## Constructor Chaining

1. this call statement
    - this call statement must be the first statement in constructor body
2. Super call statement
    - We use to call super class constructor

we can only use these in constructor body 

with the help of this call and super call - recursive call is not allowed 

## Non Static Initialiser

1. Single Line
    
    datatype varname = value;
    
2. Multi Line 
    
    {
    
    datatype varname = value;
    
    }
    
    Non static variables belong to the object 
    
    static variable are variables are shared variable
    
- Single line initaliser and multi line initialiser only executes when object is created. we dont call multi line initialiser
- A block does not have any name that block is called as a anonymous block

## Static variable

A variable which is prefixed with static modifier and created inside a class block not in method block 

We can access static variable in same class directly if we want to access outside the class we need class name as a reference 

If we want to access static variable outside the class use the class name 

fr

There are three memory categories

Method Area

Stack Area 

Heap 

- In static method we cant access non static members
- In Non static we can access static members

## Static Block

Block prefix with static is a static block

static {

}

Static block gets executed when class loaded into memory 

where as the non static block executes each time object is created

## Method Chaining

When one method another method then Method Chaining

## Encapsulation

Wrapping the data and code into a single unit is Encapsulation 

## Utility class

A class containing only static methods 

## Inheritance

Process of obtaining one class member to another class is called inheritance 

Doctor is parent class containing main general properties 

Speciality is the child class containing extra properties along with Doctor properties

How to achieve inheritance in java

with the help of extend keyword we can achieve inheritance in java 

Syntax - 

class Parent_class{

}

class Child_class extends Parent_class{

}

## Super key

super keyword is used to access the members of the parent class when child and parent have same variable name 

 

when we call super() in parent class it loads the object class 

## Polymorphism

Poly means many form means form

It performs a single action in different ways

- Compile Time Polymorphism
    - Method Overloading
- Run Time Polymorphism
    - Method Overriding
        - Giving new implementation for parent class method

## String

Sequence of characters is called string 

Whenever we write a data in double quote it is a string 

It id stored in string constant pool area 

Strings are stored in string constant pool area in heap 

## Object Class

Object class is the supermost class internally all classes inherit from object class

Object class has 11 non static methods 

In Object class we have 

- **`getClass()`**
    
    Returns: `Class<?>` — A `Class` object representing the runtime class of the object.
    
- **`hashCode()`**
    
    Returns: `int` — An integer hash code value for the object, used primarily in hash-based collections like `HashMap` and `HashSet`.
    
- **`equals(Object obj)`**
    
    Returns: `boolean` — Returns `true` if the object is equal to the specified object; `false` otherwise. By default, it compares object references.
    
- **`toString()`**
    
    Returns: `String` — Returns a string representation of the object. The default implementation returns the class name, `@`, and the hexadecimal hash code.
    
- **`clone()`**
    
    Returns: `Object` — Returns a copy (clone) of the object. Requires the class to implement the `Cloneable` interface; otherwise, it throws `CloneNotSupportedException`.
    
- **`finalize()`**
    
    Returns: `void` — Called by the garbage collector before an object is destroyed. **Note:** This method is deprecated and should not be relied upon for cleanup.
    
- **`wait()`**, **`wait(long timeout)`**, **`wait(long timeout, int nanos)`**
    
    Returns: `void` — Causes the current thread to wait until another thread calls `notify()` or `notifyAll()` on this object, or the specified timeout expires.
    
- **`notify()`**
    
    Returns: `void` — Wakes up a single thread waiting on this object’s monitor.
    
- **`notifyAll()`**
    
    Returns: `void` — Wakes up all threads waiting on this object’s monitor.
    
    ## Abstraction
    
    Abstraction in java hide the complex implementation and expose only essential feature 
    

## Interface

With the help of interface we can achieve 100 percent abstraction because it only abstract methods 

If we have more than one abstract class we call it an interface 

If we have only one abstract class we call it an absolute interface

## Comparable

A interface containing only one abstract method 

In Comparable we have an abstract method called as comparative it accepts single parameter and return integer type of data 

Comparator is also a functional interface its having only one abstract method that is compare method it accepts two parameter at a time and return integer type of data 

## Is Java 100% Object Oriented

No Java has Primitive datatypes hence its not considered as 100% Object oriented 

But with Wrapper classes these primitive datatypes are also made as objects so with Wrapper class Java can be 100% OOP

## Wrapper Class

Process of Converting primitive type to object type that thing we call as a wrapper class 

Wrapper classes are the classes that convert primitive type to non primitive type 

1. Number 
    1. Byte 
    2. Short 
    3. Integer 
    4. Long 
    5. Float 
    6. Double 
2. Character
    1. Character 
3. Boolean 

## AutoBoxing

Converting primitive type to non primitive type 

- **Autoboxing example:** `Integer num = 50;` — `int` 50 is automatically converted to `Integer` object.
- **Unboxing example:** `int value = new Integer(100);` — `Integer` object is automatically converted to `int` 100.
- Boxing - Ex.
    
    int a=10;
    
    Integer i=a;
    

## Collections

Collections provide a set of interfaces for storing groups of objects.

### ArrayList

- A dynamic collection of objects
- Internally uses arrays but resizable
- Allows duplicates
- Not synchronized
- Provides indexing for element access

---

## File Structure

```
Java Training/
├── README.md
├── Abstraction/
│   ├── AshithGF.java
│   ├── Compare.java
│   ├── Example.java
│   └── Inteface.java
├── Basics/
├── Data Structures/
│   └── Array/
├── Decision Statement/
├── Encapsulation/
├── Inheritance/
├── Looping Statements/
├── Memory Allocation/
├── Method Chaining/
├── Methods/
│   └── Method Overloading/
├── Objects/
├── Operator/
├── Polymorphism/
├── Scanner Class/
├── String Class/
└── Wrapper Classes/
```

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A text editor or IDE (VS Code, IntelliJ, Eclipse)
- Understanding of command-line basics

For practical code examples, refer to the individual folders organized by topic.

---

## Key Concepts Summary

| Concept | Description |
|---------|-------------|
| **Class** | Blueprint for creating objects |
| **Object** | Instance of a class with state and behavior |
| **Method** | Block of code that performs a specific task |
| **Constructor** | Special method called when object is created |
| **Inheritance** | Process of obtaining properties from parent class |
| **Polymorphism** | Ability to take multiple forms (overloading/overriding) |
| **Encapsulation** | Bundling data and methods into a single unit |
| **Abstraction** | Hiding complex implementation, showing only essentials |
| **Interface** | Contract defining abstract methods (100% abstraction) |

---

## Important Notes

- ✅ **JVM is mandatory** to run Java programs
- ✅ **main() method is entry point** where execution starts
- ✅ **Primitive types** need Wrapper classes for 100% OOP
- ✅ **Objects are created in heap** memory using `new` keyword
- ✅ **Static variables** are shared across all instances
- ✅ **Non-static variables** are unique to each object

---

## Learning Resources

- [Official Java Documentation](https://docs.oracle.com/javase/)
- Study each folder for topic-specific implementations
- Practice by modifying and extending the provided examples

---

