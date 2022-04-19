package Lab1;

public class Operators {
    public static void main(String[] args) {
        int a =3;
        int b =4;
        int c =a;
      //  System.out.println(a);
      //  System.out.println(b);
      //  System.out.println(++c);//prefix
      //  System.out.println(b++);//postfix
      //  System.out.println(b);
        int days =365;
        String leapyear;
        leapyear=(days>=366)?" this is leap year":"this is not leap year";
        System.out.println(leapyear);

        // To find the simple intrest
        float P = 10000, R = 5, T = 5;

        // Calculate simple interest
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
        // To find area of traingle

    }
}