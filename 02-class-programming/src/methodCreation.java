import java.util.Scanner;


public class methodCreation {

    String name;
    void greetings(){

        System.out.println("Hello " + name + " welcome to ...");
    }

    public static void main(String[] args){
        Scanner scannerName = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String inputName = scannerName.nextLine();

        methodCreation sayHello = new methodCreation();
        sayHello.name = inputName;

        sayHello.greetings();

    }

}
