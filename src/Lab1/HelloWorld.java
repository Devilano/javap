package Lab1;

public class HelloWorld {
    int myVariable=1;
    static int data = 30;
    void method(){
        int a = 100;
        System.out.println("Value of local variable a: "+a);
    }
    public static void main(String args[]) {
        HelloWorld obj = new HelloWorld();
        obj.method();
        System.out.println("Value of instance variable myVariable: " + obj.myVariable);
        System.out.println("Value of static variable data: " + HelloWorld.data);
        obj.printName();
    }
    void printName(){
        String name="rabi";
        System.out.println(name);
    }
}