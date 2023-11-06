# Lab Report 2 - Servers and SSH Keys (Week 3)
**String Server Code**  \
![Image](StringServerCode2.png)  

---

**Add Messages Example 1** \
![Image](AddMessage1.png)  \
The method in the code being called is `handleRequests`. For this add, the URI being passed as an argument is `/add-message?s=Hello` and the int field `num = 1`, so the value of `String newMessage = "1. Hello"`, and this is appended to the StringBuilder message which is returned. In this case the URLDecode method decode returns `Hello`, the same as the original argument, as there are no spaces in the inputted URI. After this request, the int field `num` is updated to equal 2. 

---

**Add Messages Example 2** \
![Image](AddMessage3.png)  \
The method in the code being called is `handleRequests`. For this add, the URI being passed as an argument is `/add-message?s=How%20are%20you`
and the int field `num = 2`. The value of String newMessage is `"2. How are you"` as the URLDecoder method decode, with the arguments of the message and `UTF=8`, removed the `%20s` and replaces them with spaces. This message is appended to the StringBuilder message, and message is returned. After this request, the int field `num` is updated to equal 3. 

---

**Public Key Path** \
![Image](PublicKeyPath.png)  
---

**Private Key Path** \
![Image](PublicKeyls.png)

---

**Logging into ieng6 without password** \
![Image](LoginNoPw.png)  

---

Something I learned from Week 2 and 3 of CSE 15l is how to compile and start a server. By cloning a git repository, we can compile a server using the javac command with the files we are compiling and start it using the java command with the name of the server we are executing and a port number. Before Week 2's Lab, I had no idea how to run a server.
