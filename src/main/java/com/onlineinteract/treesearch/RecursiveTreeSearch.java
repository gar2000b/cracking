package com.onlineinteract.treesearch;

/**
 * 
 * RecursiveTreeSearch - O(2^n) = exponential time
 * 
 * Notes:
 * The tree like structure is implicit in the recursion.
 * 
 * e.g: 
 * 
 * @author gar20
 *
 */
public class RecursiveTreeSearch {

	public static void main(String[] args) {
		System.out.println(new RecursiveTreeSearch().search(4));
	}

	protected Integer search(Integer n) {
		System.out.println("*** called ***");
		if (n <= 1) {
			return 1;
		}
		return search(n - 1) + search(n - 1);
	}
}
