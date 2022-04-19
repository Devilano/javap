package Lab1;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the marks in oop:");
        int Oop=scanner.nextInt();
        System.out.println("enter the marks in archi");
        int Archi= scanner.nextInt();
        System.out.println("enter the marks in math");
        int Math= scanner.nextInt();
        System.out.println("enter the marks in database");
        int Database= scanner.nextInt();
        int Sum=Oop+Archi+Math+Database;
        int Percent=Sum/4;
        System.out.println("Your percent is " +" "+Percent+"%");
        if (Percent >= 80) {
            System.out.print("A");
        } else if (Percent >= 60 && Percent < 80) {
            System.out.print("B");
        } else if (Percent >= 40 && Percent < 60) {
            System.out.print("C");
        } else {
            System.out.print("D");
        }

    }
}
