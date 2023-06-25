# Reading Text
> This is a school assignment for a program that searches for a word in a text file. 
<br>
Course: Computer Programming 11

<br>

## Table of Contents
- [Technologies](#technologies)
- [How to run the project](#how-to-run-project)
- [How to use the app](#how-to-use-app)
- [References](#references)

<br>

## Technologies
* Java


<br>


## <a id="how-to-run-project">How to run the project</a>
### Prerequisites:
- Have a Git and GitHub account
- Have [Java JDK](https://adoptopenjdk.net/archive.html) installed 
  - This project uses jdk-14


### Configuration instructions:

You will need to install:
- [IntelliJ](https://www.jetbrains.com/idea/download/#section=windows) (executable)
  - This project uses the community version, which is free

Cloning the repository:
- Open Command Prompt
- `cd` into the folder you want the repository stored in
- Type: `git clone https://github.com/MonB003/ReadingText.git`


Configuring the project in IntelliJ:
- In the top navbar, click *Add Configuration...*
- For the configuration, select *Application*
- Give the configuration a name (ex. Main)
- For the *Build and run* section:
  - Use java 8 SDK
  - Select the main class file you want to run (either type in the class name or browse for the file)
    - ex. sample.Main
- Once the configuration information is filled out, click *Ok*

Configuring the SDK:
- In IntelliJ:
  - File > Project Structure > Project Settings > Project
    - Use SDK 14
  - File > Project Structure > Project Settings > Modules
    - Use SDK 14

### Running the project:
1. In IntelliJ, open the Main.java file
   - Main.java file location: *Your Folder Name* /src/Main.java
2. Click the green triangle in the top right corner (when hovered on, it says: Run 'Main')
3. A small popup window will appear, which is the app


<br>


## <a id="how-to-use-app">How to use the app</a>
- After the program starts running, there will be a prompt to enter a word
- The user types a word and presses enter
- The program will print a list of each sentence, and all the indices where that word occurs in that sentence
- The text content in the in.txt file will be written to the out.txt file


<br>


## <a id="references">References</a>
- [School lecture video](https://www.youtube.com/watch?v=nAu7ReTosEE)
