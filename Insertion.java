class InsertArray {

    // method to insert element
    static void insert(int arr[], int n, int position, int element) {

        // shift elements to the right
        for (int i = n; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        // insert element at given position
        arr[position] = element;

        // print array after insertion
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[6]; // extra space
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5;          // number of elements
        int position = 2;        // index position
        int element = 26;

        insert(arr, n, position, element);
    }
}
