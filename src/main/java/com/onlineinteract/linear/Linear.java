package com.onlineinteract.linear;

/**
 * 
 * Linear function calculating sum and product in series
 * 
 * O(n) = linear time (even though both for loops are in series)
 * 
 * @author gar20
 *
 */
public class Linear {

	public static void main(String[] args) {
		new Linear().foo(new int[] { 1, 2, 3, 4 });
	}

	protected void foo(int[] array) {
		int sum = 0;
		int product = 1;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		for (int i = 0; i < array.length; i++) {
			product *= array[i];
		}
		System.out.println("sum: " + sum + " - product: " + product);
	}
}
