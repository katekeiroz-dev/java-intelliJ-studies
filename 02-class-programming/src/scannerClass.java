import java.util.Scanner;

public class scannerClass {
    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);

        String name;
        int age;
        double milkPrice;

        System.out.print("Enter your name");
        name = scannerObject.nextLine();

        System.out.print("Enter you age: " );
        age = scannerObject.nextInt();

        System.out.print("Place the price of a litre of milk: " );
        milkPrice = scannerObject.nextDouble();

        System.out.println("Hello, " + name + "! You are " + age + " years old . The price of the milk is :" + milkPrice + " $");

    }
}
