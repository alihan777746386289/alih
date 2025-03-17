import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSortBinaryBuffered {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Массив өлшемін енгізіңіз: ");
        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[n];
        System.out.println("Массив элементтерін бос орын арқылы енгізіңіз:");
        String[] input = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        insertionSort(arr);
        System.out.println("Сұрыпталған массив: " + Arrays.toString(arr));

        System.out.print("Ізделетін санды енгізіңіз: ");
        int key = Integer.parseInt(reader.readLine());
        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println(key + " саны индексі: " + index);
        } else {
            System.out.println("Элемент табылмады.");
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}