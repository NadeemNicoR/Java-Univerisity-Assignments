# Exercise 03 -- Fundamental Algorithms
### Submission Deadline: December 2, 2018 at 3 pm!
In the third assignment, the tasks focus on a class of fundamental algortihms: **Sorting Algorithms**.

For solving the tasks, this repository contains:

* *two different classes* in the `src` folder of this repository.
One class, `Clock.java`, is just provided to be used, thus, should **NOT** be modified. 
The other class, `Main.java`, constitutes the template for the implementation tasks in *3-02* and *3-03*.
**IMPORTANT: Make use of the provided class for your solution. 
Also, do not change the method signature on your own (there is a good reason for the provided signatures).
Otherwise, we will account for a malus (i.e., reducing your points even if the solution is basically correct)!**
* A text file, `TheoreticalQuestions.txt`, that must be used to answer the theoretical questions of the particular tasks.
Hence, take care that you also push this file to your repository before deadline!
* a `test` folder, containing the tests for the implementation. 
These tests are implemented by the instructor and can be used by you to improve your code. 
Also, these tests are kind of initial sanity check for assessing the assignment.
*Remember that you can run the test file(s) as well to check whether your implementation works correctly.*
**Run the tests to check whether your solutions works correctly. But do not touch/change them!**
* some more files needed for handling the project in Eclipse (or for proper push/pull the repository). See the slides for more details. In general, the other files **should not be changed or deleted, if you do not really know what you are doing**!!

In the following, you will find the particular tasks to be solved.

## Task 3-01: Sorting (in general)
<table border="0">
  <tr>
   <td>
Based on the lecture materials for the sorting algorithms *InsertionSort* and *SelectionSort*, 
explain how these algorithms work and point out their differences. 

 </td>

<td>2 Points</td>
  </tr>
<tr>
  <td>
   
   Which of these sorting algorithms is stable? Explain your answer briefly.         
    
  </td>
  <td>1 Point</td>
</tr>
<tr>
  <td>

Regarding *InsertionSort*: 
How does its computational complexity change if the position for inserting the element is found using *binary search instead of linear search*? 

  </td>
  <td>1 Point</td>
</tr>
</table>

## Task 3-02: Quicksort for Comparable Objects

<table border="0">
<tr>
  <td>

Explain the algorithm *Quicksort* (in the file `TheoreticalQuestions.txt`) using the example `a = {5, 3, 4, 8, 7, 1, 2}` 
and the *middle element* constituting the pivot element. Write down the contents of this array 
*after each partitioning*.

</td>

<td>1 Point</td>
  </tr>
<tr>
  <td>

	Which complexity class does *QuickSort* belong to (average case)? Give reasons. 
	Discuss whether the choice of the pivot element influences the number of comparisons needed. 
	What does a “worst case” look like?
          
 </td>
  <td>1 Point</td>
</tr>
<tr>
  <td>

Implement the *Quicksort* algorithm, presented during the lecture, in such a way that 
objects of type `Comparable` can be sorted. To this end, use the following method, provided in class `Main.java`.

```public static <T extends Comparable<T>> void quickSort (T[] a)```

NOTE: you are allowed to implement additional methods if needed. 
However, make sure that the actual sorting algorithm is triggered by the method, provided in class `Main.java`

</td>
  <td>2 Points</td>
</tr>
<tr>
  <td>

Test your method using the Clock objects from the task Class `Clock` (available in the repository) within your `main` function. 

Note: In order to do this, the class `Clock` needs to implement the interface `Comparable<Clock>`, 
as well as the method `int compareTo(Clock t)`. Hence, your class from the previous assignment may not work.

          
</td>
  <td>1 Point</td>
</tr>
</table>

## Task 3-03: MergeSort Using Comparator

```
b.	// auxiliary function for recursive sorting by merging
c.	private static void _mergeSort(int a[], int copy[], int start, int end){
d.		if (start < end) {
e.			int mid = (start + end) / 2;
f.			_mergeSort(a, copy, start, mid);
g.			_mergeSort(a, copy, mid + 1, end);
h.			merge(a, copy, start, mid, end);
i.		}
j.	}
k.	
l.	private static void merge(int a[], int copy[], int start, int m, int end) {
m.		int i = 0, j = start, k;
n.		while (j <= m)
o.			copy[i++] = a[j++];
p.		i = 0;
q.		k = start;
r.		while (k < j && j <= end) {
s.			if (copy[i] <= a[j])
t.				a[k++] = copy[i++];
u.			else
v.				a[k++] = a[j++];
w.		}
x.		while (k < j)
y.			a[k++] = copy[i++];
z.	}
aa.	    
bb.	public static  void mergeSort(int[] a) {
cc.		_mergeSort(a, new int[a.length], 0, a.length - 1);
dd.	}
```


<table border="0">
<tr>
   <td>
          
Explain the sorting algorithm *MergeSort*, presented above, considering the example of `a = {5, 3, 4, 7, 1, 2}` 
while noting down all intermediate steps (as in the lecture, cf. slides 334 to 340). 
Explain the principle of *“divide and conquer”* with this algorithm.

</td>

<td>1 Point</td>
  </tr>
<!-- subtask 02-->
<tr>
   <td>
          
Why does this algorithm require less space than that one presented during the lecture?

</td>

<td>1 Point</td>
  </tr>
<!-- subtask 03-->
<tr>
   <td>
          
Is the *MergeSort* algorithm stable? Give reasons for your answer.

</td>

<td>1 Point</td>
  </tr>
<!-- subtask 04-->
<tr>
   <td>
          
Please write a function, using the template in class `Main.java`:

```
public static <T> void mergeSort(T[] a, Comparator<T> c)
```
for sorting a generic *array a* using the algorithm *MergeSort*.

NOTE: you are allowed to implement additional methods if needed. 
However, make sure that the actual sorting algorithm is triggered by the method, provided in class `Main.java`

</td>

<td>2 Points</td>
  </tr>
<!-- subtask 05-->
<tr>
   <td>
          
Test the generic *mergeSort* in the `main` method using string objects. 
Sort your strings in ascending order first, and in descending order afterwards.

</td>

<td>1 Point</td>
  </tr>
  
<tr>
  <td align="right">Total Points</td>
    <td>15</td>
  </tr>  
</table>
