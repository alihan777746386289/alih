import java.util.Arrays;

public class MergeSortStatisticsBuffered {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 7, 2, 5};
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Сұрыпталған массив: " + Arrays.toString(arr));
        System.out.println("Ең үлкен элемент: " + arr[arr.length - 1]);
        System.out.println("Ең кіші элемент: " + arr[0]);
        System.out.println("Орташа мән: " + Arrays.stream(arr).average().orElse(0));
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = Arrays.copyOfRange(arr, left, right + 1);
        Arrays.sort(temp);
        System.arraycopy(temp, 0, arr, left, temp.length);
    }
}