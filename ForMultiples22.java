import java.util.Scanner;

/**
 * ForMultiples22
 */
public class ForMultiples22 {

    public static void main(String[] args) {
        Scanner input22 = new Scanner (System.in);

        // Declare
        int multiple;
        int sum = 0;
        int counter = 0 ;

            System.out.print("INPUT THE MULTIPLE = ");
            multiple = input22.nextInt();

            //Declare Di luar
            int i;
            for(i = 1; i  <=50; i++){
                if (i % multiple == 0 ) {
                    sum = sum +i;
                    counter++;
                }
            }

            System.out.printf("There Are %d numbers that are multiple of %d in range 1 to 50. \n", counter ,multiple);
            System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiple, sum);
            
            // for (int i = 1; i <= 50; i++) {
            //     if (i % multiple == 0) {
            //         sum = sum + i;
            //         counter++;
            //         // System.out.print(i+"-");
            //     }
            // }
            
    }
}