package Array;
public class SecondSmall {
    public static void main(String[] args) {
        int[] arr={2,4,1,8,9};
        int small=arr[0];
        int secondSmall=arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]<small){
               small=arr[i]; 
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<secondSmall && arr[i]<small){
                secondSmall=arr[i];
            }
        }
        System.out.println("second small:"+secondSmall);

    }
    
}
