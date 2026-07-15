package Array;

public class Average {
    public static void main(String[] args) {
    int[] arr={10,20,45,55,60,75};
    int sum=0;
    double average;
    for(int i=0; i<arr.length; i++){
        sum+=arr[i];
    }
    average=(double)sum/arr.length;
    System.out.println("sum:"+sum);
    System.out.println("average:"+average);
    }
}
