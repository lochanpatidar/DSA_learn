package Stack;
import java.util.Stack;
public class Stack1 {
   public static void main(String[] args) {
     Stack<String> st =new Stack<>();
      st.push("riya");
      st.push("priya");
      st.push("jiya");
      System.out.println(st.size());
      System.out.println(st);
      st.pop();
      System.out.println(st+" "+st.size());
      System.out.println(st.peek());
   } 
}
