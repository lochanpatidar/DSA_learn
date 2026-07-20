package Array;

public class RangeSumQuery {
    public static void main(String[] args) {
        int[] arr = {1,3,7,8,5,9,4};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int L = 1;
        int R = 3;
        int sum;
        if (L == 0)
            sum = prefix[R];
        else
            sum = prefix[R] - prefix[L - 1];
        System.out.println("Range Sum = " + sum);
    }
}

