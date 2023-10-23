# Lab Report 1 - Remote Access and FileSystem (Week 1)
**Example 1 - cd No Arguments**  \
![Image](cdNoArgs.png)  \
The working directory is /home. The output is nothing because I am attempting to change the directory without providing a directory to change it to, so it does not do anything. This is not an error, it just does nothing as the computer is already in the home directory so `cd` without any arguments will not do anything. If the working directory is not /home, using `cd` without arguments will switch the working directory to /home.

---

**Example 2 - cd Directory**  \
![Image](cdDirectory.png)  \
The working directory is /home. The current working directory is now /lecture1 as the command changed the directory to lecture1. There is not an error.

---

**Example 2 - cd File**  \
![Image](cdFile.png)  \
The working directory is /home/lecture1. The output is an error as I am attempting to use change directory with a file as an argument instead of a directory. 

---

**Example 4 - ls No Arguments**  \
![Image](lsNoArgs.png)  \
The working directory is /home. The output is lecture1 as I am listing the files and directories in the home directory and lecture1 is the only directory listed within the home directory. There is not an error.

---

**Example 5 - ls Directory**  \
![Image](lsDirectory.png)  \
The working directory is /home. The output is a list of the files and directories within the lecture1 folder as I am listing the files and directories within this directory. There is not an error.

---

**Example 6 - ls File**  \
![Image](lsFile.png)  \
The working directory is /home. The output is the file as I am using the list command with a file, so it outputs the file name, given the file exists. There is not an error.

---

**Example 7 - cat No Arguments**  \
![Image](catNoArgs.png)  \
The working directory is /home. There is no output as the program is waiting for an input. The current program has to be cancelled through Ctrl + c in order to continue to use the program. There is no error, but the command does not work.

---

**Example 8 - cat Directory**  \
![Image](catDirectory.png)  \
The working directory is /home. The output tells me that lecture1 is a directory as `cat` is meant to be used with a file to show its contents. This is an error message as I am trying to display the contents of a directory when the `cat` command is meant to be used with a file.

---

**Example 9 - cat File**  \
![Image](catFile.png)  \
The working directory is /home. The output displays the contents of the given file, en-us.txt, which is "Hello World!" There is no error. 
