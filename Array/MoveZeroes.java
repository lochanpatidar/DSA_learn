package Array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr={1,0,2,0,5,6,0};//move Zeroes to the end
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
