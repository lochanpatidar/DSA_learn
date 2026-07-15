package Array;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr={10,5,15,20,6};
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
