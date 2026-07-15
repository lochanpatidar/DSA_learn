package Array;
import java.util.Scanner;
public class FindMissing {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the value:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if (arr[i+1] != arr[i]+1){
                System.out.println("missing value:"+(arr[i]+1));
                break;
            }
        }
        sc.close();
    }
    
}
