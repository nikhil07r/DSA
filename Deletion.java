class DeleteArray {

    // method to delete element
    static void delete(int arr[], int n, int position) {

        // shift elements to the left
        for (int i = position; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // print array after deletion
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;   // number of elements
        int position = 2;          // index to delete

        delete(arr, n, position);
    }
}
