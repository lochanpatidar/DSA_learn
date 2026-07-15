package Array;

public class MaxDiff {
    public static void main(String[] args) {
        int[] arr={10,2,4,1,6};
        int maxDiff=arr[1]-arr[0];
        for (int i=0; i<arr.length; i++){
         for (int j=i+1; j<arr.length; j++){
           int diff=arr[j]-arr[i];
           if(diff>maxDiff){
            maxDiff=diff;
           }
        }
        }
        System.out.println("maximum differance:"+maxDiff);
    }
    
}
