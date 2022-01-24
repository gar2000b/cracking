package com.onlineinteract.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class BinarySearchTest {

	private static int[] array = { 1, 5, 8, 9, 11, 13, 15, 19, 21, 23 };
	private static BinarySearch binarySearch;

	@BeforeClass
	public static void setup() {
		binarySearch = new BinarySearch();
	}

	@Test
	public void binarySearchPositiveTest() {
		int result = binarySearch.search(array, 9, 0, array.length);
		assertEquals(3, result);
	}

	@Test
	public void binarySearchNegativeTest() {
		int result = binarySearch.search(array, 2, 0, array.length);
		assertEquals(-1, result);
	}

	@Test
	public void binarySearchLimit1Test() {
		int result = binarySearch.search(array, 1, 0, array.length);
		assertEquals(0, result);
	}

	@Test
	public void binarySearchLimit2Test() {
		int result = binarySearch.search(array, 23, 0, array.length);
		assertEquals(9, result);
	}

	@Test(expected = NullPointerException.class)
	public void binarySearchNull1Test() {
		binarySearch.search(array, null, 0, array.length);
	}

	@Test(expected = NullPointerException.class)
	public void binarySearchNull2Test() {
		binarySearch.search(array, 1, null, array.length);
	}

	@Test(expected = NullPointerException.class)
	public void binarySearchNull3Test() {
		binarySearch.search(array, 1, 0, null);
	}
	
	@Test(expected = NullPointerException.class)
	public void binarySearchNull4Test() {
		binarySearch.search(null, 1, 0, 10);
	}
}
