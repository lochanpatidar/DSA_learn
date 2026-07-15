package Array;
public class LargestElement {
    public static void main(String[] args) {
       int[] arr={3,5,9,1,7,2};
       int max=arr[0];
       for(int i=0; i<arr.length; i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
        System.out.println("max value:"+max);
    }
    
}
