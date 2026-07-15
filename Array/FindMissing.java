package Array;

public class FindMissing {
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,7};
        for(int i=0; i<arr.length; i++){
            if (arr[i+1] != arr[i]+1){
                System.out.println("missing value:"+(arr[i]+1));
                break;
            }
        }
    }
    
}
