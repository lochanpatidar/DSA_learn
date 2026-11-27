package Stack;
import java.util.*;
import java.util.Stack;
public class DailyTemperatures {
        public static void main(String[] args) {
        int arr[] = {73, 74, 75, 71, 69, 72, 76, 73};
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                int index = st.pop();
                ans[index] = i - index;
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
