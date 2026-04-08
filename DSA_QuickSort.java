

public class DSA_QuickSort {
    int Partition(int arr[], int P, int r){
        int i = P - 1;
        int x = arr[r];
        //System.out.println("Pivot value-->"+x);
        for(int j = P; j < r; j++){
            if(arr[j] <= x){
                i++;
                int t = arr[i]; // swapping / Exchange A
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        // Display(arr, P, r+1);

        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;

        //Display(arr, P, r+1);
        return i + 1;
    }

    void QuickSort(int arr[], int P, int r){
        if(P<r){
            int q=Partition(arr, P, r);
            QuickSort(arr, P, q-1);
            QuickSort(arr, q+1, r);
        }
    }

    void Display(int arr[], int start, int end){
        for(int i = start; i < end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        DSA_QuickSort ob=new DSA_QuickSort();
        int arr[]={10, 7, 8, 9, 1, 5};
        int n=arr.length;
        System.out.println("Original array:");
        ob.Display(arr, 0, n);
        ob.QuickSort(arr, 0, n-1);
        System.out.println("Sorted array:");
        ob.Display(arr, 0, n);
    }
}
