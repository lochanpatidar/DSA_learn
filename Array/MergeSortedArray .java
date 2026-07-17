package Array;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {10, 30, 50};
        int[] arr2 = {20, 40, 60};
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        for (int k = 0; k < arr3.length; k++) {
            if (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    arr3[k] = arr1[i];
                    i++;
                } else {
                    arr3[k] = arr2[j];
                    j++;
                }
            } else if (i < arr1.length) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
        }
        for (int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + " ");
        }
    }
}