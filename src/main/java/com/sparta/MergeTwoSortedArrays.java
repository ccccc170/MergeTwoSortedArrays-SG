package com.sparta;

public class MergeTwoSortedArrays {
    public static int[] arrayMerger(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArr[k] = arr1[i];
                i++;
            }
            else {
                mergedArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            mergedArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            mergedArr[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArr;
    }
}
