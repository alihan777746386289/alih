import java.util.Arrays;

public class MergeSortAndStatsExample {
    public static void computeStatistics() {
        int[] arr = {10, 15, 20, 30, 25};
        int[] sortedArr = mergeSort(arr);
        System.out.println("Сұрыпталған массив: " + Arrays.toString(sortedArr));
        
        int minVal = sortedArr[0];
        int maxVal = sortedArr[sortedArr.length - 1];
        double avgVal = getAverage(sortedArr);
        
        System.out.println("Ең кіші элемент: " + minVal);       // Ең кіші элемент: 10
        System.out.println("Ең үлкен элемент: " + maxVal);      // Ең үлкен элемент: 30
        System.out.println("Орташа мән: " + String.format("%.2f", avgVal)); // Орташа мән: 20.00
    }
    
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }
    
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }
    
    public static double getAverage(int[] arr) {
        long total = 0;
        for (int num : arr) {
            total += num;
        }
        return (double)total / arr.length;
    }
}