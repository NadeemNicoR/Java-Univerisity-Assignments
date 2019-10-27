import java.util.*;

public class Main {

	public static <T extends Comparable<T>> void quickSort (T[] a) {
        //your implementation goes here
		qsort(a, 0, a.length-1);
	}
	public static <T extends Comparable<T>> void qsort(T[] arr, int first, int last) {
		int split = partition(arr, first, last);
		if (first < split - 1)
			qsort(arr, first, split - 1);
		if (split < last)
			qsort(arr, split, last);
	}
	public static <T extends Comparable<T>> int partition(T[] arr, int first, int last) 
	{
		T pivot = arr[last], temp;
//		System.out.println(pivot);
		int i = first-1;
		int j = last+1;
		while (i < j) {
			int c;
			do{
				i++;
				c =(arr[i].compareTo(pivot));
			}while(c<0);
			do{
				j--;
				c =(arr[j].compareTo(pivot));
			}while(c>0);
			if (i < j)
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp; // swap
			}
		}
		return i; // new index of pivot
	}

	private static <T> void _mergeSort(T[] a, T[] copy, int start, int end, Comparator<T> comparator) {
		if (start < end) {
			int mid = (start + end) / 2;
			_mergeSort(a, copy, start, mid, comparator);
			_mergeSort(a, copy, mid + 1, end, comparator);
			merge(a, copy, start, mid, end, comparator);
		}
	}

	private static <T> void merge(T[] a, T[] copy, int start, int m, int end, Comparator<T> comparator) {
		int i = 0, j = start, k;
		while (j <= m)
			copy[i++] = a[j++];

		i = 0;
		k = start;
		while (k < j && j <= end) {
			int compareResult = comparator.compare(copy[i], a[j]);
			if (compareResult < 0)
				a[k++] = copy[i++];
			else
				a[k++] = a[j++];
		}
		while (k < j)
			a[k++] = copy[i++];

	}

	@SuppressWarnings("unchecked")
	public static <T> void mergeSort(T[] a, Comparator<T> comparator) {
		_mergeSort(a, (T[]) new Object[a.length], 0, a.length - 1, comparator);
	}

	public static void main(String[] args) {
		{
			
		        //test your functions here
			System.out.println("Input Array of clock objects");
				Clock[] clocks = {new Clock(150), new Clock(120), new Clock(190), new Clock(60), new Clock(180), new Clock(95), new Clock(140)};
				System.out.println(Arrays.toString(clocks));
				System.out.println("_______________________________________________________________________");
				System.out.println("Input Array of clock objects");
				quickSort(clocks);
				System.out.println(Arrays.toString(clocks));

			System.out.println("_______________________________________________________________________");
			String[] a = new String[] { "Exam", "is", "coming ", "soon", "godsaveme" };

			// ascending order
			Comparator<String> c1 = new Comparator<String>() {
				public int compare(String a1, String a2) {
					if (a1.length() > a2.length())
						return 1;
					if (a1.length() < a2.length())
						return -1;
					return 0;
				}
			};

			mergeSort(a, c1);
			System.out.println(Arrays.toString(a));
			// descending order
			Comparator<String> c2 = new Comparator<String>() {
				public int compare(String a1, String a2) {
					if (a1.length() > a2.length())
						return -1;
					if (a1.length() < a2.length())
						return 1;
					return 0;
				}
			};
			mergeSort(a, c2);
			System.out.println(Arrays.toString(a));
		}
	}
}
