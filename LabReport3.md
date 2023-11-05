# Lab Report 3 - Bugs and Commands (Week 5)

**Failure Inducing Input for Buggy Reverse Program**   \

```
@Test
public void testReversedMany() {
  int[] input1 = {1, 2, 3};
  for(int i = 0; i < 3; i++){ System.out.println(ArrayExamples.reversed(input1));}
  assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
}
```

---
  
**Input That Does Not Induce Failure for Buggy Reverse Program**   \

```
@Test
public void testReversed() {
  int[] input1 = { };
  assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
}
```

---

**Symtom of Running Tests**
![Image](SymptomReverse.png)


---

**Buggy Code (Before)**
![Image](ReverseBefore.png)

**Code After**
![Image](ReverseAfter.png)

The fix between the before and after code addresses the issue as in the buggy code, as in the original code, `arr` is being set to the value of `newArray` at `[arr.length - i - 1]`, but `newArray` is filled with 0s as it was just initialized and has 0 as the value of each element as is the default for java. The new code works as it is iterating through the length of `arr` and setting the values of `newArray` equal to those of `arr` at `[arr.length - i - 1]` which would make `newArray` the reverse of `arr`, and then returning `newArray`.

  
