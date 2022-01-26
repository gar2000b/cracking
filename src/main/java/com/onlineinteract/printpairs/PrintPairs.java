package com.onlineinteract.printpairs;

/**
 * 
 * Print pairs - printing every possible combination/permutation of i & j.
 * 
 * O(N ^ 2) - quadratic time.
 * 
 * Basically, when you see an embedded for loop inside another where each is
 * traversing over the same array - it's really doing it (n x n) times or (n ^
 * 2) times, hence time complexity O(N ^ 2).
 * 
 * @author gar20
 *
 */
public class PrintPairs {

	public static void main(String[] args) {
		new PrintPairs().printPairs(new int[] { 1, 2, 3, 4, 5 });
	}

	protected void printPairs(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}
}
