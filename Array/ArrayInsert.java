package Array;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr={2,5,8,9,10};
        int pos=1;
        int value=3;
        for (int i=arr.length-1; i>=pos; i--) {
            arr[i]=arr[i-1];
        }
        arr[pos]=value;
        for(int i=0; i<arr.length; i++){
            System.err.println(arr[i]+" ");
        }
    }
}
