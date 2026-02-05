class Delete {
    static int Search(int A[], int key) {
        for (int i = 0; i < A.length; i++)
            if (A[i] == key)
                return i;
        return -1;
    }
    public static void main(String[] args) {
        int A[] = {10, 20, 30, 40, 50};
        int key = 30;
        int q = Search(A, key);
        if (q != -1) {
            for (int i = q + 1; i < A.length; i++) {
                A[i - 1] = A[i];
            }
            A[A.length - 1] = 0;
        }
        System.out.println("Array after deletion:");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}