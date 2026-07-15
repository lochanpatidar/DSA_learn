package Array;

public class SecondElement {
    public static void main(String[] args) {
        int[] arr={10,12,15,30,20};
        int largest=arr[0];
        int secondLargest=arr[0];
        for (int i=0; i<arr.length; i++){
          if(arr[i]>largest){
            largest=arr[i];
          }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("secondlargest number:"+secondLargest);
    }
    
}
