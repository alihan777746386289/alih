import java.util.Arrays;

public class InsertionSortAndSearchExample {
    public static void performSortingAndSearching() {
        int[] arr = {8, 3, 6, 2, 9};
        int searchElement = 6;
        
        insertionSort(arr);
        System.out.println("Сұрыпталған массив: " + Arrays.toString(arr));
        
        int index = binarySearch(arr, searchElement);
        if (index != -1) {
            System.out.println(searchElement + " саны индексі: " + index); // 6 саны индексі: 2
        } else {
            System.out.println(searchElement + " саны табылмады");
        }
    }
    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    public static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}