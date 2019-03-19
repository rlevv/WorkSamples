# Software Requirements Specification
# For  Duck Dating App
Version 1.0
Prepared by
Matthew Imiolek, Ryan Levitt, Katie Ellman-Aspnes
Vassar College
5/14/2018

# Revision History
| Name  | Date    | Reason For Changes  | Version   |
| ----  | ------- | ------------------- | --------- |
|  Sameer Pradhan &nbsp; | May 2, 2018 &nbsp;| Initial version derived from the  &nbsp; | &nbsp; 0.1 |
| |                        | IEEE Std. 830 (1998) &nbsp;              |  |

# 1. Introduction
This section gives a scope description and overview of everything included in the SRS document. Also, the purpose for this document is described and a list of abbreviations and definitions is provided.

## 1.1 Purpose
The purpose of this document is to give a detailed description of our Duck Dating App. It will illustrate the purpose, implementation, and development the of our software. This document will also explain our systems constraints relevant to any user or potential developer.

## 1.2 Scope
The Duck Dating App is an application which helps ducks find potential dates. The program generates a compatibility score based on a preference profile for species, colors, lengths, and first initials of the other duck. The user receives a potential match, the match's qualities (species, length and first initial) and opts to either pursue compatibility or move on to the next match. The user can also create their own duck, look at their previous matches, or exit the program. This will use basic user interaction, but not a full GUI.

It will also be able to create random ducks with which to compare against. 

## 1.3 Definitions, acronyms and abbreviations
User - Someone who interacts with the duck dating app
Type - The class of duck

## 1.4 References
[1] IEEE Software Engineering Standards Committee, "IEEE Std 830-1998, IEEE Recommended Practic for Software Requirments Specifications", October 20, 1998.

## 1.5 Overview
The remainder of this document includes three chapters. ADD MORE DETAIL ABOUT WHAT EACH CHAPTER DOES/APPENDIXES

# 2 Overall Description
This section will give an overview of the whole program. It will be explained in context to show the basic functionality and any interactions it may have. It will also decribe what kind of users will use the proram, and what they will be able to do. Finally, the constraints and assumptions will be presented.

## 2.1 Product Perspective
This system will only have one part: a self-contained computer application. This application will be used to create the user's duck and randomly generated ducks with which the user can compare and match. Ducks also have some functional qualities like flying and quack for potential further extensions and patches.

### 2.1.1 System interfaces
Our system only includes a user interface, which asks users to create ducks, match and quit (further specified in 2.1.2).

### 2.1.2 User interfaces
This program will have a basic user interface, consisiting of just text on the screen. Users will be able to input a string for the name of a duck and the type of that duck using a string consisting of the first unique letter in the name of the type of duck (IE. M for mallard duck). After this the user will be able to input 1, 2, or 3 to make a selection of how the program will procede. On a 1 it will create a new match where the user can input Y or N to match or not match with a duck. On a 3 the program will ask if the user really wants to quit when they can input Y or N to actually quit.

### 2.1.3 Hardware interfaces
This program does not have any hardware interfaces.

### 2.1.4 Software interfaces
This program does not have any other specific programs required to run it or any other software interfaces.

### 2.1.5 Communications interfaces
This program does not have any communication interfaces.

### 2.1.6 Memory constraints
This program does not have an memory constraints though it will not be able to support ducks in extremely large quantities that exceed the limits of the counters.

### 2.1.7 Operations
As described in User interfaces (2.1.2). The user drives the flow of the program. The program expects the user to input their name and make decisions about how they want to use the application. The user decides when to move to the match and the application will wait for user input. The application continues to wait until the user quits the application.

### 2.1.8 Site adaptation requirements
We do not have any site adaptation requirments


## 2.2 Product functions
This program will allow for the user to give a certain amount of input in the creation of a duck, allow the user to try to match with other ducks, to show all previously matched ducks, and exit the program.

The program will also be able to create a number of random ducks (or a goose) for comparison. Ducks will be able to do a combination of activities which include fly, swim, and quack. Some ducks will be able to fly in many different ways. Ducks will also have a profile which will have their preferences for other ducks, which will be able to be shown and used to create a compatibility score with another duck.

Ducks will also be able to be compared based on size and type. Two ducks can also be used to create a compatibility, which will hold an integer representing how compatible they are. This score and either be directly returned or have a string representing how compatible two ducks are returned instead.

## 2.3 User characteristics
The user of this program must only be able to use a keyboard to use this program once it is started. Most functionality will not be directly accesable to the user, but require actually editing the code to access.

## 2.4 Constraints
We were limited primarily due to the small amount of time to work on the project, and that we could only use JAVA to complete it.

## 2.5 Assumptions and dependencies
One assumption is that all computers this program is run on will be able to use JAVA programs. There could be a custom OS that cannot.

The other assumption is that there is enough memory to run the program. If computers are very heavily limited they might not.

## 2.6 Apportioning of requirements
We would like to create a nice GUI, and allow the user to give more access to what ducks can do, but these functions can wait till later if not possible.

# 3 Specific requirements
This section gives specific, detailed descriptions of the program and off of its features.


## 3.1 External interfaces
The user inputs a number of values to create a duck, and then can give some other inputs to decide what to do with the duck they created (find a new match, see the previous matches, or exit the program). These decisions will create various changes and outputs (specifically create matches, close the program, and output the lsit of rpevious matches).

## 3.2 Functions

The primary functions for our duck dating app are functions that generating ducks,functions that print according to ducks (like fly, quack, squeak, display), and all functions interacting with the user inputs.

## 3.3 Performance requirements
All operations will be completed in less than 1 second. 

## 3.4 Logical database requirements
We do not use a database.

## 3.5 Design constraints
Design constraints are the DuckApp foundation, our time limit of 5/15/18, and that we can only use Java.

## 3.6 Software system attributes
Our application is written in Java 8.1 with JUnit 4.12 Tests.

### 3.6.1 Reliability
JUnit tests were used to ensure the reliability of the program.

### 3.6.2 Availability

Our state pattern helps regulate availability.

### 3.6.3 Security
We do not have any secuirty measures in place.

### 3.6.4 Maintainability
We implemented a number of design patterns in order to increase maintainability, specifically the State pattern to help with user interaction, the Strategy pattern to help with the ducks and what they can do, and another Strategy pattern to help with creating the ducks dating profiles and preferences. We have worked to reduce coupling and ensure that a single change in one class does not echo throughout the application.

### 3.6.5 Portability
100% of the code was written in Java 8.1, so any system that can use Java 8+ can use this program.

## 3.7 Organizing the specific requirements

The primary system requirements are on the use of Java 8.1. Otherwise our application is fairly small scale at the moment.

### 3.7.1 System mode
While we do not have system modes, we do employ states which affect the behavior of our program. These states regulate multiple different functionalities of our program.

### 3.7.2 User class
Our users all have equal access to the program. There are no classes of users in our application.

### 3.7.3 Objects

Our primary objects are our ducks. Our generators and profiles are also important object but mostly serve as features for ducks.

### 3.7.4 Feature

The primary features in our program are quacking, flying, comparing, compatability, and profiles. These all help develop our duck object.

### 3.7.5 Stimulus

The stimulus are our user inpur stream, the states,  and our random generators.

### 3.7.6 Response

Our application is comprised of all functions generating random ducks/duck qualities, all functions generating duck printing (like fly, quack, squeak, display), and all functions interacting with the user inputs.

### 3.7.7 Functional hierarchy

Our class diagram offers a good model of the functional hierarchy of our code. 

## 3.8 Additional comments


# 4 Supporting information
Here are out table of contents, index, and appendixes.

## 4.1 Table of contents and index

## 4.2 Appendixes
Refer to our class diagram and project vision for more information.
