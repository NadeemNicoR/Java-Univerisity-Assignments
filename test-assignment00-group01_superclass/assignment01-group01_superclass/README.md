# Exercise 01 -- Java Basics

The first exercise encompasses several small tasks to get familiar
with Java and programming basics in general. You can find the tasks in the following.
As a template for your solution, the class  `Main.java` has been created in the `src` folder of this repository, 
containing all methods with its corresponding signature.
**Use this template for your solution. Otherwise, we will account for a malus (i.e., reducing your points even if the solution is correct)!**

**Submission Deadline: Sunday, November 4, at 3 pm**

*RECOMMENDATION: Do not wait with working on the assignment until the deadline is approaching!*

## Task 1-01: Primes

<table border="0">
  <tr>
   <td>
Please write a Java method
     
```public static boolean isPrime (int n)```

which determines as efficiently as possible whether a **natural number** *n* is prime or not. The method should return `true` if *n* is prime, and `false` otherwise.</td>

<td> 2 Points</td>
  </tr>
<tr>
  <td>Write an additional method
    
```public static int nextPrime (int n),```

which, for some **natural number** *n*, yields the smallest prime greater or equal to *n*.
</td>
  <td>1 Point</td>
</tr>
</table>


## Task 1-02: Median


<table border="0">
  <tr>
    <td>Please write a Java method

```public static int median (int a, int b, int c)```

which yields the median of the three integers a, b and c (i.e. the middle value of those three numbers in sorted order).

**Example:** `median(25, 11, 33)` yields 25
</td>
<td> 1 Point</td>
  </tr>
<tr>
  <td>Write an alternative Java method 

```public static int median2 (int a, int b, int c)```

for determining the median of those three integers. 
Do not copy the solution from above (there are more clever solutions for reuse).
</td>
  <td>1 Point</td>
</tr>
<tr>
  <td>
    How could you test your function median? 
    Write a small (unit) test within your main method.
Note: The main method is not verified when submitting your solutions, but discussed during the exercise.

</td>
  <td>1 Point</td>
</tr>
</table>

## Task 1-03: Working with Arrays

<table border="0">
  <!-- ============ subtask 01 ============ -->
  <tr>
   <td>Please write a Java method
     
```public static int[] createRandom (int n)```

which takes the size of the *array n* which should be created within the method. 
The elements of the array should then be filled with random integers within the range from 5 to 99 (inclusively). 

Note: You may use the standard function `random` of the class *Math* for generating the random numbers. 
By using the command: 
    `int z = (int)(maxrand*Math.random());`
you can create a random number z between 0 and maxrand. (*0 <= z < maxrand*).

    
</td>
<td> 2 Points</td>
  </tr>
  <!-- ============ subtask 02 ============ -->  
<tr>
  <td>Please write a Java method

```public static String toString (int[] a)```

which shall return the elements of *array a* as a string. 

Example: An array, containing the numbers *1, 2 and 3* should be returned as the following String: *\[1,2,3\]*.    
Note: The squared bracket have to be added by you in any case.

Test your toString(…) method within your main function. Test it also using the predefined method java.util.Arrays.toString(...).

  </td>
  <td>1 Point</td>
</tr>
  <!-- ============ subtask 03 ============ -->
<tr>
  <td>	Please write a Java method 

```public static int posMin (int[] a)```

which yields the position of the smallest number in *array a*. If the minimal value occurs multiple times, returning the first occurrence is sufficient. 

  </td>
  <td>1 Point</td>
</tr>
  <!-- ============ subtask 04 ============ -->
<tr>
  <td>Please write a Java method

```public static void swap (int[] a)```

which swap the first and the last element within the *array a*.
  </td>
  <td>1 Point</td>
</tr>
<tr>
  <td align="right">Total Points</td>
    <td>11</td>
  </tr>
</table>
