package String;
    import java.util.Scanner;
public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        String result = "";
        result += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1))
                result += str.charAt(i);
        }
        System.out.println("remove consocative"+result);
        sc.close();
    } 
}
