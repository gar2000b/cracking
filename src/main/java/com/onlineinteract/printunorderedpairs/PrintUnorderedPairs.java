package com.onlineinteract.printunorderedpairs;

/**
 * 
 * Print unordered pairs - similar to printing all pairs except the inner loop
 * starts by 1+ each time.
 * 
 * O(N ^ 2) - quadratic time.
 * 
 * ^ this is because technically it's (N ^ 2) / 2.
 * 
 * @author gar20
 *
 */
public class PrintUnorderedPairs {

	public static void main(String[] args) {
		new PrintUnorderedPairs().printUnorderedPairs(new int[] { 0, 1, 2, 3, 4, 5 });
	}

	protected void printUnorderedPairs(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}
}
