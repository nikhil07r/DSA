public class MergeSort {
    
    public static void mergeSort(int[] arr, int p, int n) {
        if (p < n) {
            int v = (p + n) / 2;
            mergeSort(arr, p, v);
            mergeSort(arr, v + 1, n);
            merge(arr, p, v, n);
        }
    }
    
    public static void merge(int[] arr, int p, int v, int n) {
        int n1 = v - p + 1;
        int n2 = n - v;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for (int i = 0; i < n1; i++)
            left[i] = arr[p + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[v + 1 + j];
        
        int i = 0, j = 0, k = p;
        
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.print("Original: ");
        for (int num : arr) System.out.print(num + " ");
        
        mergeSort(arr, 0, arr.length - 1);
        
        System.out.print("\nSorted: ");
        for (int num : arr) System.out.print(num + " ");
    }
}