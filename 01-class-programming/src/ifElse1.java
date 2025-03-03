public class ifElse1 {

        public static void main(String[] args) {
            int num1 = 28;
            int num2 = 73;
            int num3 = 64;
            int largestNum;
            if (num1 > num2 && num1 > num3) {
                largestNum = num1;
            } else if (num2 > num1 && num2 > num3) {
                largestNum = num2;
            } else {
                largestNum = num3;
            }

            System.out.println("The largest of the three numbers is " + largestNum);
        }
    }

