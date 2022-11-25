package com.test;

import com.sparta.MergeTwoSortedArrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeTwoArraysTest {
    @Test
    @DisplayName("Function returns an empty array when passed two empty arrays")
    public void returnsEmptyArrayWhenPassedTwoEmptyArrays () {
        int[] arr1 = new int[0];
        int[] arr2 = new int[0];
        int[] expectedArr = new int[0];
        int[] result = MergeTwoSortedArrays.arrayMerger(arr1, arr2);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns a sorted array when passed one sorted array and one empty array")
    public void returnsSortedArrayWhenPassedOneSortedArrayOneEmptyArray () {
        int[] arr1 = new int[0];
        int[] arr2 = { 1, 3, 9 };
        int[] expectedArr = { 1, 3, 9 };
        int[] result = MergeTwoSortedArrays.arrayMerger(arr1, arr2);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns a sorted array when passed two arrays with one value each")
    public void returnsSortedArrayWhenPassedTwoArraysWithOneValueEach () {
        int[] arr1 = { 2 };
        int[] arr2 = { 5 };
        int[] expectedArr = { 2, 5 };
        int[] result = MergeTwoSortedArrays.arrayMerger(arr1, arr2);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns a sorted array when passed one array with one value and another with multiple values")
    public void returnsSortedArrayWhenPassedArrayWithOneValueAndArrayWithMultipleValues () {
        int[] arr1 = { 2, 6, 12, 19 };
        int[] arr2 = { 5 };
        int[] expectedArr = { 2, 5, 6, 12, 19 };
        int[] result = MergeTwoSortedArrays.arrayMerger(arr1, arr2);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns a sorted array when passed two equal length arrays with multiple values")
    public void returnsSortedArrayWhenPassedTwoEqualLengthArraysWithMultipleValues () {
        int[] arr1 = { 2, 6, 12, 19 };
        int[] arr2 = { 5, 15, 20, 25 };
        int[] expectedArr = { 2, 5, 6, 12, 15, 19, 20, 25 };
        int[] result = MergeTwoSortedArrays.arrayMerger(arr1, arr2);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns a sorted array when passed two different length arrays with multiple values")
    public void returnsSortedArrayWhenPassedTwoDifferentLengthArraysWithMultipleValues () {
        int[] arr1 = { 2, 6, 12, 19, 21, 26, 36 };
        int[] arr2 = { 5, 15, 20, 25 };
        int[] expectedArr = { 2, 5, 6, 12, 15, 19, 20, 21, 25, 26, 36 };
        int[] result = MergeTwoSortedArrays.arrayMerger(arr1, arr2);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns a sorted array when passed arrays containing zero and minus values")
    public void returnsSortedArrayWhenPassedArraysWithZeroAndMinusValues () {
        int[] arr1 = { -12, -6, 0, 7, 13, 14, 23};
        int[] arr2 = { -20, -16, -8, -2, 1, 3, 5, };
        int[] expectedArr = { -20, -16, -12, -8, -6, -2, 0, 1, 3, 5, 7, 13, 14, 23 };
        int[] result = MergeTwoSortedArrays.arrayMerger(arr1, arr2);
        assertArrayEquals(expectedArr, result);
    }
}
