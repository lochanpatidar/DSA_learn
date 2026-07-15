package Array;

public class SumArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,5,7};
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("sum of array:" +sum);
    }
    
}
