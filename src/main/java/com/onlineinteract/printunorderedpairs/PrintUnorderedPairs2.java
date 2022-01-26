package com.onlineinteract.printunorderedpairs;

/**
 * 
 * Print pairs - similar to printing all pairs except we are doing this over x2
 * arrays.
 * 
 * O(AB) - doesn't appear to fit into any particular category but it is almost
 * certainly worse than quadratic time.
 * 
 * ^ this is because it is the length of array A x length of array B.
 * 
 * @author gar20
 *
 */
public class PrintUnorderedPairs2 {

	public static void main(String[] args) {
		new PrintUnorderedPairs2().printUnorderedPairs2(new int[] { 0, 1, 2, 3, 4, 5 },
				new int[] { 0, 1, 2, 3, 4, 5, 6, 7 });
	}

	protected void printUnorderedPairs2(int[] arrayA, int[] arrayB) {
		int count = 0;
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				count += 1;
				System.out.println("count: " + count);
				if (arrayA[i] < arrayB[j]) {
					System.out.println(arrayA[i] + "," + arrayB[j] + "\n");
				}
			}
		}
	}
}
