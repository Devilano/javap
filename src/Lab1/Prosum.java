package Lab1;

import java.util.Scanner;

public class Prosum {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1= number.nextInt();

        System.out.print("Enter a number: ");
        int num2=number.nextInt();

        int sum=num1+num2;
        int product =num1*num2;

        System.out.println("Total sum of the given integer is " +sum+ " and product is "+product);
        int sum2=sum+product;
        int product2=sum*product;

        System.out.println("Lab1.Sum :" +sum2+ " Product: " +product2);
    }
}
