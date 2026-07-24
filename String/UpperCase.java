package String;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=sc.nextLine();
        String Upper=str.toUpperCase();
        System.out.println("lower to upper: " +Upper);
    }
}
