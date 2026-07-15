package Array;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the search number: ");
        int key= sc.nextInt();
        for (int i=0; i<arr.length; i++) {
            if(arr[i]==key){
                System.out.println("element found at index:"+i);
                return; //return immediately stops the program because the element has been found.
            } 
        }
               System.out.println("element not found");
             sc.close();  
    } 
}
