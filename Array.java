public class Array {

        int A[] = {12, 124, 45, 75, 96 , 32 , 47, 90 , 41,45};
        int B[] = {23, 45, 67, 89, 12 , 34 , 56, 78 , 90,11};
        int serch(int key, int a[]){
            for(int i=0; i<a.length; i++){
                if(a[i] == key){
                    return i;
                }
            }
            return -1;
        }

     public static void main(String[] args) {   
        Array obj = new Array();
        int result = obj.serch(96, obj.A);
        if(result == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
