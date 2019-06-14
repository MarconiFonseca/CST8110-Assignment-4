/*
  CST8110 Introduction to Computer Programming 
  Author: Marconi Fonseca
  section:330 lab teacher:Anissa Shaddy 
  Assignment #4: Date:Dec 2018 
 */

public class Assign4 {

	public static void main(String[] args) {
		boolean testSucceeds;

		// Test that the default constructor works properly
		testSucceeds = true;
		SortedStringArray ssa = new SortedStringArray();
		if (ssa.size() != 0) {
			System.err.println("Default constructor: initial size is wrong");
			testSucceeds = false;
		}
		if (ssa.capacity() != 10) {
			System.err.println("Default constructor: initial capacity is wrong");
			testSucceeds = false;
		}
		if (testSucceeds) {
			System.out.println("Default constructor: working correctly");
		}

		// Test that the initial constructor works properly
		ssa = new SortedStringArray(8);
		if (ssa.capacity() != 8) {
			System.err.println("Initial constructor: initial size is wrong");
			testSucceeds = false;
		}
		if (testSucceeds) {
			System.out.println("Initial constructor: working correctly");
		}

		// Test that the add method works properly
		ssa.add("b");
		ssa.add("c");
		ssa.add("a");
		ssa.add("f");
		ssa.add("e");
		ssa.add("d");
		ssa.add("i");
		ssa.add("g");
		ssa.add("h");
		ssa.add("k");
		ssa.add("j");

		if (ssa.size() == 11 && ssa.capacity() >= 11) {
			System.out.println("Add: working Correctly");
		} else {
			System.out.println("Add: Not working incorrectly");
		}

		// Test that the get method works properly
		if (ssa.get(0) == "a") {
			System.out.println("Get: working Correctly");

		} else {
			System.out.println("Get: Not working incorrectly");
		}

		// Test that the getIndex method works properly
		if (ssa.getIndex("a") == 0) {
			System.out.println("GetIndex: working Correctly");
		} else {
			System.out.println("GetIndex: Not working incorrectly");
		}

		// Test that the delete method works properly

		if (ssa.delete(0)) {
			System.out.println("Delete: working Correctly");
		} else {
			System.out.println("Delete: Not working incorrectly");
		}

		// Test that the delete method works properly

		if (ssa.delete("b")) {
			System.out.println("Delete String: working Correctly");
		} else {
			System.out.println("Delete: Not working incorrectly");
		}

		if (ssa.delete("c")) {
			System.out.println("Delete String: working Correctly");
		} else {
			System.out.println("Delete: Not working incorrectly");
		}

	}

}
