package com.onlineinteract.binarysearch;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = { 1, 5, 8, 9, 11, 13, 15, 19, 21, 23 };
		int search = 15;

		new BinarySearch().search(array, search, 0, array.length);
	}

	protected int search(int[] array, Integer search, Integer lower, Integer upper) {
		if (search == null || lower == null || upper == null || array == null)
			throw new NullPointerException("Please ensure array, search, lower and upper params are specified");

		int midpoint = (upper + lower) / 2;
		System.out.println(midpoint);

		if (search == array[midpoint]) {
			System.out.println(search + " found at position: " + midpoint);
			return midpoint;
		} else if (midpoint == 0) {
			System.out.println("Could not find " + search);
			return -1;
		} else if (search < array[midpoint])
			return search(array, search, lower, midpoint);
		else if (search > array[midpoint])
			return search(array, search, midpoint, upper);

		return -1;
	}
}
