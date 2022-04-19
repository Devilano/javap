import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the principle:");
        String P = scanner.nextLine();
        System.out.println("Enter a rate:");
        String T = scanner.nextLine();
        System.out.println("Enter a time:");
        String R = scanner.nextLine();
        int P1= Integer.parseInt(P);
        int T1=Integer.parseInt(T);
        int R1=Integer.parseInt(R);
        int SI=(P1*T1*R1)/100;

        System.out.println(SI);


    }
}