import java.util.Arrays;

public class MergeTwoArraysExample {
    public static void combineAndSort() {
        int[] A = {3, 6, 1};
        int[] B = {7, 2, 5};
        int[] mergedArray = mergeSortedArrays(A, B);
        System.out.println(Arrays.toString(mergedArray)); // [1, 2, 3, 5, 6, 7]
    }
    
    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int[] merged = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                merged[k++] = A[i++];
            } else {
                merged[k++] = B[j++];
            }
        }
        while (i < A.length) {
            merged[k++] = A[i++];
        }
        while (j < B.length) {
            merged[k++] = B[j++];
        }
        return merged;
    }
}