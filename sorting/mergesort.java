public class mergesort {
    static void mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = (low +high) / 2;

        // Divide
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        // Merge
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;       // left array
        int j = mid + 1;   // right array
        int k = 0;

        // Compare elements from both halves
        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining elements of left half
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining elements of right half
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy back into original array
        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] arr = {8, 4, 2, -6, 1, 5};

        mergeSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}