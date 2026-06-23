# Online-Examination-System-Task4# Online Examination System 📝

A simple Java console-based **Online Examination System** that allows users to log in, update their profile, take a timed multiple-choice exam, and view their final score.

## Features

* User Login System
* Profile Update Functionality
* Multiple Choice Questions (MCQ) Exam
* Automatic Exam Submission after Time Limit
* Score Calculation and Display
* Logout Option

## Technologies Used

* Java
* `java.util.Scanner`
* Core Java Programming Concepts

## Project Workflow

1. User enters username and password.
2. Successful login grants access to the main menu.
3. User can:

   * Update Profile
   * Start Exam
   * Logout
4. During the exam:

   * Questions are displayed one by one.
   * User selects an answer.
   * Exam is automatically submitted when the time limit expires.
5. Final score is displayed after submission.

## Menu Options

### 1. Update Profile

Allows users to change:

* Username
* Password

### 2. Start Exam

* Displays multiple-choice questions.
* Accepts answers from the user.
* Evaluates responses.
* Calculates total score.

### 3. Logout

Ends the session and exits the application.

## Exam Details

### Time Limit

* 60 Seconds (1 Minute)

### Sample Questions

#### Question 1

```text
Java is a ?

A. Language
B. Car
C. Mobile
D. Game
```

#### Question 2

```text
JVM stands for ?

A. Java Virtual Machine
B. Java Very Main
C. Just Virtual Machine
D. None
```

#### Question 3

```text
Size of int in Java ?

A. 2
B. 4
C. 8
D. 16
```

## Scoring System

* Each correct answer = 1 Mark
* Total Questions = 3
* Maximum Score = 3

Example:

```text
Score = 2/3
```

## Project Structure

```text
task4.java
```

## Compilation and Execution

### Compile

```bash
javac task4.java
```

### Run

```bash
java task4
```

## Sample Output

```text
===== ONLINE EXAMINATION SYSTEM =====

Enter Username: admin
Enter Password: 1234

Login Successful

1.Update Profile
2.Start Exam
3.Logout
Enter Choice: 2

1. Java is a ?
A.Language
B.Car
C.Mobile
D.Game

Answer: A

2. JVM stands for ?
A.Java Virtual Machine
B.Java Very Main
C.Just Virtual Machine
D.None

Answer: A

3. Size of int in Java ?
A.2
B.4
C.8
D.16

Answer: B

Exam Submitted
Score = 3/3
```

## Code Overview

### `main()`

* Handles login process.
* Displays menu options.
* Controls program flow.

### `updateProfile()`

* Updates username and password.
* Saves new user credentials.

### `startExam()`

* Displays questions.
* Accepts user responses.
* Checks answers.
* Handles timer functionality.
* Calculates score.

## Future Enhancements

* Database Integration
* Secure Authentication System
* Question Bank Management
* Randomized Questions
* Negative Marking
* Result History
* Admin Panel
* GUI Version using Java Swing or JavaFX
* Online Exam Portal with Networking Support

## Learning Concepts Covered

* Arrays
* Methods
* Loops
* Conditional Statements
* User Input Handling
* Time Management using System Time
* Menu-Driven Programs
* Basic Authentication Logic

## Author

Developed as a Java Mini Project for learning Core Java programming concepts.
