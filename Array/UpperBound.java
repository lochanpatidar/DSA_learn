package Array;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int target = 50;
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Upper Bound Index = " + ans);
    }
}

