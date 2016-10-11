
#Class Lesson: Java program structure and syntax
---
###Sheet Exercises:

[logo]: https://github.com/luisdcb97/Java/blob/master/Sheet/ads.png "Combination Equation"

1. Ex1

 Write a **program** which calculates the combinations of *n* elements of a set taken *k* by *k* according to the following equation:
 
  ![alt text][logo]

2. Ex2
 Write a **program** which sums all integers, starting with 1 and ending when the result is larger than a limit provided by the user.

3. Ex3
 Write a **program** which receives a binary number from the user and displays _on-screen_ the number of 1s, 0s and its decimal equivalent.
 Example:  
 
 >bin = 10110  
 zeroes = 2  
 ones = 3  
 decimal = 22  
4. Ex4
 Write a **program** which calculates the *_4 lowest multiples_* between 0 and 100 of any number *n* in that interval.
 Example:
 
 >n = 25  
 Multiples: 0 25 50 75  
5. Ex5
 Two numbers are called friends when the sum of the divisors of either one, including 1 and excluding themselves, is equal to the other.
 Write a **program** which verifies if two numbers *n* and *m* are friends.
 Example:  
 
 > 220 and 284 are friends  
 Divisors of 220: 1,2,4,5,10,11,20,22,44,55,110  Soma: 284  
 Divisors of 284: 1,2,4,71,142  
6. Ex6
 A number is perfect if the sum of its divisors equals itself. Write a **program** which reads a number *n*>3 and determines all perfect numbers from 3 to n. Example:  
 
 >Perfect Number: 6  
 Divisors: 1 2 3  
7. Ex7
 The number 153 is equal to the cube of each of its digits. There are 4 3-digit numbers with this property. Write a **program** to find and display all 4.
8. Ex8
 Given a value *n*, determine all numbers with *n* digits who replicate themselves in the lowest valued digits when squared. Example:
 
 >n=2  
 Contains: 25 ( 25\*25 = 6**25**)  
 Contains: 76 ( 76\*76 = 57**76**)
9. Ex9
 Implement the **method int isPrime( int x )** which checks if a number *x* is prime. It should return 1 if true and 0 if false.
 Write a **program** which calculates and prints all primes between 1 and a limit provided by the user.

10. Ex10
 Construct a **method int invert( int i )** which inverts the digits order of an integer. Using that method, build a **program** which verifies if an integer is a palindrome, i.e., can be read the same way from both sides.Example: 1221 121 
11. Ex11
 Write a **method** which determines the Lowest Common Multiple ( LMC ) of 2 integers *n* and *m* given to it as parameters. Use this method to list the LMC of all pairs of numbers within an interval provided by the user.
12. Ex12
 The Binary Logarithm of a number is given by the number of times that number can be divided by 2 until the result is lower than 2. Example:
 
 >lg(7.9) = 2  
 lg(8) = 3
 
 Write a **program** which calculates and prints the Binary logarithms of all numbers multiple of 100 between 100 and 1000.
13. Ex13
 Write a **method** which verifies if an integer *x*, between 1 and 99, is contained in an integer *n* bigger than *x*.
 Example:
 
 >x = 7 and n = 1977 -- Yes  
 x = 56 and n = 12345567 -- Yes  
 x = 54 and n = 12345567 -- No
 
 Using this method create a **program** that recieves from the user the value of *x* and writes on-screen  all integers lower than 1000 which contain *x*.
