package Lab1;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the student name:");
        String name= scanner.nextLine();
        System.out.println("Enter the student lastname:");
        String lastname= scanner.nextLine();
        System.out.println("Enter the student adress");
        String adress= scanner.nextLine();
        String Details=name+" "+adress+" "+lastname;
        System.out.println(Details);

    }
}
