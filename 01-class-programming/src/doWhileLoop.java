public class doWhileLoop {
    public static void main(String[] args){
        int count = 1 ; /* declare an interger variable count and initialise it to 1 */

        do{
            System.out.println("Count:" + count);
            count++;

            /* the do while loop prints the value of count and increments it by 1 in each interation */

        } while (count <= 20);

        /* the loop will execute 10 times , printing the number from 1 to 10 */
    }
}
