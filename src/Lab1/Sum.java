package Lab1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=scanner.nextInt();
        System.out.println("enter the second number:");
        int b=scanner.nextInt();
        System.out.println("enter the third number:");
        int c=scanner.nextInt();
        int Sum=a+b+c;
        System.out.println(Sum);
    }
}
