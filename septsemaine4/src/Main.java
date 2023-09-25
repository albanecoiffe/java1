import java.util.Scanner;

/*1. Create a new class file with the main method with any name:

a. Add a method accept any number between 1 to 10 to find the factoriel of that number

	i. If the value is less than 1 or more than 10 → throw your own custom exception class
	ii. The exception class you will have to create in the second point
*/
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Out {

        Scanner scanner = new Scanner(System.in);

        System.out.print("put a number : ");
        int nombre = scanner.nextInt();

        if (nombre<1 || nombre >10) {
            throw new Out();
        } else {
            int result = 1;
            for (int i=1; i<=nombre; i++){
                result *= i;
        }
            System.out.println("the factorial of your number is :" +result);

    }}}
