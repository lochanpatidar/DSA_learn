package Array;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {5,7,2,1,6,8,9};
        int k = 3;
        int sum = 0;
        // Sum of first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("Maximum Sum = " + maxSum);
    }
}

