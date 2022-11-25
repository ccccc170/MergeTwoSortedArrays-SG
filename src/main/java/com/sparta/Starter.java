package com.sparta;

import java.util.Arrays;

public class Starter {
    public static void start() {
        int[] arr1 = new int[] {5, 12, 19, 25, 35, 46, 51};
        int[] arr2 = new int[] {-6, -2, 0, 5, 18, 23, 39};

        System.out.println("Arrays to sort: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] mergedArr = MergeTwoSortedArrays.arrayMerger(arr1, arr2);

        System.out.println("Merged array: ");
        System.out.println(Arrays.toString(mergedArr));
    }
}
