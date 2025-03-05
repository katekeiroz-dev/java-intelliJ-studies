/* Driver Class
-Write a main method that asks the user to enter the data and stores it in the correct variables,
then prints it back to the console in main() create the following

input of type Scanner (initialise this field using new Scanner(System.in))
String name;
String address;
String dateOfBirth;
double height;
*/

import java.util.Scanner;

public class labChallenge2 {



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name;
        String address;
        String dateOfBirth;
        double height;

        System.out.println("Entering details");
        System.out.println("----------------");
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your address: ");
        address = input.nextLine();

        System.out.print("Enter your date of birth: ");
        dateOfBirth = input.nextLine();

        System.out.print("Enter your height: ");
        height = input.nextDouble();

        System.out.println();
        System.out.println("\n\nPrinting details");
        System.out.println("----------------");
        System.out.println(
                "User Entered {" +
                        "name='" + name + '\'' +
                        ", address='" + address + '\'' +
                        ", dateOfBirth='" + dateOfBirth + '\'' +
                        ", height=" + height +
                        '}');


    }

}
