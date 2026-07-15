package Array;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,8,9,0};
        int[] copy= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            copy[i]=arr[i];

        }
        System.out.println("copies array:");
        for (int i=0; i<arr.length; i++){
            System.out.println(copy[i]+ " ");
        }
    }
    
}
