package Lab1;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth = scanner.nextDouble();
        double area = length*breadth;
        int castedArea = (int) (area);
        System.out.println("Area is " +castedArea);

    }
}

