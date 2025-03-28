public class SelectionSortExample {
    public static void execute() {
        int[] arr = {4, 7, 1, 9, 3};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr)); // [9, 7, 4, 3, 1]
    }
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}