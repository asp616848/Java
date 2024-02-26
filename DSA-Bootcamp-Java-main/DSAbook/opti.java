public class opti {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 9, 8, 10};
        int n = arr.length;
        int k = n / 2;
        opti obj = new opti();
        obj.mergesort(arr, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private void mergesort(int arr[], int k) {
        if (arr.length <= k) {
            insertion_sort(arr);
        } else {
            int mid = arr.length / 2;
            int left[] = new int[mid];
            int right[] = new int[arr.length - mid];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for (int i = 0; i < arr.length - mid; i++) { // Fix array indexing here
                right[i] = arr[i + mid];
            }
            mergesort(left, k);
            mergesort(right, k);
            merge(left, right, arr);
        }
    }

    private void merge(int left[], int right[], int arr[]) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    private void insertion_sort(int arr[]) {
        for (int i = 2; i < arr.length; i++) { // Fixed the loop starting index to 1
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
