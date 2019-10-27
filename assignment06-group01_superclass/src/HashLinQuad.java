public class HashLinQuad {
	private int[] table; // hash table
	private int size; // current number of elements
	private int capacity; // capacity of the hash table

	public HashLinQuad(int _size) {
		table = new int[_size];
		this.size = 0;
		capacity = _size;
		for (int i = 0; i < _size; i++)  // logic for empty
			table[i] = -1;
	}

	public int addLin(int obj) {
		// add obj into table using linear probing
		int hIndex = obj;  //obj%this.capacity would have been better 
		int count = 0;
		while (this.table[hIndex] != -1) { //if that particular index is not empty
			++hIndex;
			if (hIndex >= capacity) {			//whole while loop is to find the empty position where the element can be inserted
				hIndex %= capacity;
			}
			count++;
		}
		table[hIndex] = obj;
		this.size++;  //i.e, number of elements =1
		return count;

	}

	public int addQuad(int obj) {
		// add obj into table using quadratic probing
		int hIndex = obj;
		int i = 1, count = 0;
		while (this.table[hIndex] != -1) {    //count will gent changed only when the collision occurs
			hIndex = obj + i * i;
			count++;
			i++;
			if (hIndex >= capacity) {
				hIndex %= capacity;
			}
		}
		table[hIndex] = obj;
		this.size++;
		return count;
	}

}
