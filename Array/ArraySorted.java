package Array;

import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n= sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
         arr[i]=sc.nextInt();
        }
        int sort=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[i+1]){
                sort=1;
                break;
            }
        }
        if(sort==0){
            System.out.println("array is sorted");
        
        }
        else{
            System.out.println("array is not sorted");
        }
    }
    
}
