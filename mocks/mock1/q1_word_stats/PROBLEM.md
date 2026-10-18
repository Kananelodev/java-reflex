# Word Stats  (Easy, 20 points)

You are given one line of text. A **word** is a maximal run of English letters (`a-z`, `A-Z`);
every other character (spaces, digits, punctuation) separates words.

Print three lines:
1. the number of words
2. the longest word exactly as it appears (if several tie, the one that appears first)
3. the most frequent word, compared case-insensitively and printed in lowercase
   (if several tie, the alphabetically smallest)

If the line contains no words, print `0`, then `-`, then `-`.

**Constraints:** the line has at most 1,000,000 characters (it may be empty).

### Sample input
```
Hello, hello world! Programming in Java is fun; java JAVA.
```

### Sample output
```
10
Programming
java
```

Write your solution in `Solution.java` in this folder (class name must stay `Solution`).
