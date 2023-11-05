# Lab Report 2 - Servers and SSH Keys (Week 3)
**String Server Code**  \
![Image](StringServerCode2.png)  

---

**Add Messages Example 1** \
![Image](AddMessage1.png)  \
The method in the code being called is `handleRequests`. For this add, the URI being passed as an argument is `/add-message?s=Hello` and `num = 1`, so the value of `newMessage = 1. Hello`, and this is appended to the StringBuilder message which is returned. In this case the URLDecode method decode returns `Hello`, the same as the original argument, as there are no spaces in the inputted URI. After this request, `num` is updated to equal 2. 

---

**Add Messages Example 2** \
![Image](AddMessage3.png)  \
The method in the code being called is `handleRequests`. For this add, the URI being passed as an argument is `/add-message?s=How%20are%20you`
 and `num = 2`. The value of newMessage is `2. How are you` as the URLDecoder method decode, with the arguments of the message and `UTF=8`, removed the `%20s` and replaces them with spaces. This message is appended to the StringBuilder message, and message is returned. After this request, `num` is updated to equal 3. 

---

**Private Key Path** \
![Image](PrivateKey.png)  

---

**Public Key Path** \
![Image](PublicKey.png)  

---

**Logging into ieng6 without password** \
![Image](LoginNoPw.png)  

---

Something I learned from week 2 and week 3 of cse 15l is how to compile and start a server. By cloning a git repository, we can compile a server using the javac command and start it using the java command. Before this, I had no idea how to start a server.
