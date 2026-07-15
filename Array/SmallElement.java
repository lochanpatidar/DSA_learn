package Array;
public class SmallElement {
    public static void main(String[] args) {
        int [] arr={10,20,35,25,40};
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum value:"+min);
    }
    
}
