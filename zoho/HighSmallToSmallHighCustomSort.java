public class customSort {
    public static void mergeSort(int[] data, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start,
                j = mid + 1,
                k = 0;
        while (i <= mid && j <= end) {
            if (data[i] <= data[j]) {
                temp[k] = data[i];
                i++;
            } else {
                temp[k] = data[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = data[i];
            i++;
            k++;
        }
        while (j <= end) {
            temp[k] = data[j];
            j++;
            k++;
        }
        for (i = start; i <= end; i++) {
            data[i] = temp[i - start];
        }
    }

    public static void cSort(int[] arr, int length) {
        int result[] = new int[length - 1], leftPointer = 0, rightPointer = length - 1, index = 0;
        while (leftPointer < rightPointer) {
            result[index++] = arr[rightPointer--];
            result[index++] = arr[leftPointer++];
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 3, 6, 4, 234, 435, 35, 53, 5, 353, 543, 45, 5, 456, 54654, 645, 65, 546, 54, 343, 25, 45 };
        int length = arr.length;
        mergeSort(arr, 0, length - 1);
        cSort(arr, length);
        System.out.println('9' - 0);
    }
}
