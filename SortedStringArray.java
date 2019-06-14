
/*
  CST8110 Introduction to Computer Programming 
  Author: Marconi Fonseca
  section:330 lab teacher:Anissa Shaddy 
  Assignment #4: Date:Dec 2018 
 */

import java.util.Arrays;

public class SortedStringArray { // an array of Strings with entries in sorted order, that grows as needed

	private String[] stringArray; // Array to contain sorted Strings
	private int currentSize; // Current number of Strings

	public SortedStringArray() { // Default constructor with initial capacity of 10
		stringArray = new String[10];
	}

	public SortedStringArray(int initialCapacity) {// Initial constructor with the given capacity
		stringArray = new String[initialCapacity];
	}

	public void add(String s) { // Add an entry in the correct sorted location

		String[] stringArray2;
		stringArray[currentSize++] = s;
		if (currentSize >= stringArray.length) {
			stringArray2 = new String[stringArray.length + 1];
			System.arraycopy(stringArray, 0, stringArray2, 0, stringArray.length);
			stringArray = stringArray2;
			// stringArray2[stringArray.length-1];

		}
		Arrays.sort(stringArray, 0, currentSize);

	}

	public void print() { // Print the sorted array
		for (int i = 0; i < currentSize; i++) {
			System.out.print(stringArray[i] + " ");
		}
	}

	public String get(int index) {// Get the entry at the sorted position
		if (index < 0 || index > stringArray.length) {
			return null;
		} else {
			return stringArray[index];
		}
	}

	public int getIndex(String getInd) {// Get the entry at the sorted position
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i] != null && stringArray[i].equals(getInd)) {
				return i;
			}
		}
		return -1;
	}

	public boolean delete(int index) { // Get the index of the given entry

		if (index <= stringArray.length - 1) {
			for (int i = index; i != stringArray.length - 1; i++) {
				stringArray[i] = stringArray[i + 1];
			}
			currentSize = currentSize - 1;
			return true;
		}

		else {
			// System.out.print("ERROR");
			return false;
		}

	}

	public boolean delete(String index) { // Delete the given entry

		boolean check = false;
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i] != null && stringArray[i].equals(index)) {
				delete(i);
				check = true;
			}
		}
		return check;
	}

	public int size() {
		return currentSize;
	}

	public int capacity() {
		return stringArray.length;
		// Get the current capacity
	}

}
