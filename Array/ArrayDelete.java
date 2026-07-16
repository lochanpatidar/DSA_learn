package Array;

public class ArrayDelete {
    public static void main(String[] args) {
        int[] arr={3,6,4,7,9};
        int pos=2;
        for(int i=pos; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        for(int i=0; i<arr.length-1; i++){
            System.err.print(arr[i]+" ");
        }
    }
}
