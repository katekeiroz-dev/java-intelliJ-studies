import java.util.Scanner;

public class methodReturn {

    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        methodReturn retuningSmt = new methodReturn();

        System.out.println("Please, enter a number");

        int val = input.nextInt();
        int result = retuningSmt.numMultiply(val);
        System.out.println("This number mutiply by 2 is : " + result);

    }

    int numMultiply(int theNumber){
        theNumber =  theNumber * 2;
        return theNumber;
    }


}
