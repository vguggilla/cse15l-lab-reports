# Lab Report 4 - Vim (Week 7)

**Logging Into ieng6**
![Image](login.png)

`<up>` as my last command on terminal history was logging in to ieng6. `<enter>`.

---

**Cloning Repo**
![Image](cloneLab7.png)

Navigated to my fork of lab7 on github. Clicked the code button, SSH, and the copy button. Typed git clone and pasted ssh url from fork using `<command + v>`. `<enter>`.

---

**Tests Failing**
![Image](testsFail.png)

Changed directory to lab7, then copied the javac command from Week 4 lab using `<command + c>` then `<command + v>` and `<enter>`.  Copied the java command using `<command + c>` from Week 4 lab and pasted using `<command + v>` then `<control + w>` to delete `ArrayTests`. `<L>` then `<tab>` to autofill to ListExamples then `<T>` then `<tab>` to autofill to `ListExampleTest.` then `<delete>` to remove the period and `<enter>` to compile and run the tests. 

---

**Editing the Code and Running Tests Again**
![Image](editingVim.png)

Typed `<vim>` then `<L>` `<tab>` `<.>` `<tab>` `<enter>` to enter the ListExamples.java code file. Entered `<:44>` to go to the line that needs to be changed. Then `<e>` `<right>` to navigate the the space after index1. `<i>` to enter insert mode, `<backspace>` `<2>` to replace index1 with index2. `<esc>` to exit insert mode `<:wq>` to save and exit.
`<up>` `<up>` `<up>` as the `javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java` was three up in history then `<enter>`. `<up>` `<up>` `<up>` as the `java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests` was three up in history then `<enter>`.

![Image](vimPass.png)

---

**Committing to Git**

![Image](gitCommit.png)
Typed out git add, `<L>` `<tab>` and `<enter>` to stage the ListExamples.java file. Typed git commit command and `<enter>` to commit the changes to my Github account.


