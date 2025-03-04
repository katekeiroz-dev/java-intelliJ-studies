public class methodCreation1 {

    void numBetween(int num1, int num2){
        System.out.println("The number between " + num1 + "and " + num2 + "is: ");
        for (int i = num1; i< num2; i++ ){
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args){
            methodCreation1 printNumbers = new methodCreation1(); //create an instance and the call the method
            printNumbers.numBetween(10, 30);

    }
}
