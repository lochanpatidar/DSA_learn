package Stack;
import java.util.Stack;
public class Stack1 {
   public static void main(String[] args) {
     Stack<String> st =new Stack<>();
      st.push("riya");
      st.push("priya");
      st.push("jiya");
      st.push("tiya");
     
      st.push("kiya");
      System.out.println(st.size());
      System.out.println(st);
      st.pop();
      System.out.println(st+" "+st.size());
      System.out.println(st.peek());
      System.out.println(st.pop());
   } 
}
