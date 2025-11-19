Java Exception Handling and File I/O Demos

This repository contains a collection of essential Java programs that demonstrate fundamental concepts in Exception Handling and File Input/Output (I/O). These examples are designed to show how to write robust, error-tolerant code and interact with the file system.

🛠️ Project Structure

The files are organized to separate core exception demos from File I/O demos (which are placed in a package).

.
├── DemoExceptionHandling.java       # Basic try-catch block
├── DemoExceptionHandlingNeed.java   # Shows a program crash without exception handling
├── DemoFinally.java                 # Demonstration of the 'finally' block
├── DemoManyCatches.java             # Catching multiple exception types (Arithmetic, NullPointer, Array Index)
├── DemoThrow.java                   # Explicitly throwing a NullPointerException
├── DemoThrows.java                  # Using the 'throws' keyword for checked exceptions (IOException)
├── StudentNotFoundException.java    # Example of a custom unchecked exception
└── org
    └── ycpait
        └── DemofileIO
            ├── FileCopy.java        # Reads from one file and writes to another
            ├── DemoFileRead.java    # Reads content from a file
            └── DemoFileWrite.java   # Writes content to a file (uses finally for resource cleanup)


🔑 Key Concepts Covered

1. Exception Handling

File

Concept

Notes

DemoExceptionHandling.java

Basic try-catch

Catches ArithmeticException (division by zero) and prints the stack trace for debugging.

DemoManyCatches.java

Multiple catch Blocks

Demonstrates handling different types of runtime exceptions (NullPointer, Array Index, Arithmetic) and the use of a generic catch(Exception e).

DemoFinally.java

The finally Block

Shows that the code in the finally block executes regardless of whether an exception is thrown, caught, or uncaught.

DemoThrow.java

throw Keyword

Used to manually throw an exception object, such as a NullPointerException.

DemoThrows.java

throws Keyword

Used in a method signature to declare that the method might throw a checked exception (IOException), forcing the calling method to handle it.

StudentNotFoundException.java

Custom Exceptions

A simple example of creating a custom unchecked exception by extending RuntimeException.

2. File I/O

File

Concept

Notes

DemoFileWrite.java

File Output (Write)

Uses FileOutputStream to write data. Crucially, it includes a finally block to ensure the stream is closed, preventing resource leaks.

DemoFileRead.java

File Input (Read)

Uses FileInputStream to read content byte-by-byte from the file created by the write demo.

FileCopy.java

File Copy

Combines FileInputStream and FileOutputStream to read from readme.txt and write the data to a new file, creadme.txt.

⚙️ How to Compile and Run

Prerequisites

Java Development Kit (JDK) installed on your system.

Compilation Steps

Since the File I/O examples are in a package (org.ycpait.DemofileIO), you need to compile them from the root directory.

Clone the repository:

git clone <your-repository-url>
cd <repository-name>


Compile the source files:

javac *.java org/ycpait/DemofileIO/*.java


Execution Examples

Run the programs from the root directory.

Task

Command

Write to File

java org.ycpait.DemofileIO.DemoFileWrite

Read from File

java org.ycpait.DemofileIO.DemoFileRead

Copy File

java org.ycpait.DemofileIO.FileCopy

Run finally Demo

java DemoFinally

Run throws Demo

java DemoThrows
