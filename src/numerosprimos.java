
import java.lang.Math;
import java.util.Scanner;
public class numerosprimos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 2;
        int usersNumber;
        int var=0;

        do {

            System.out.print("Digite un número entre 5 y 300: ");
            usersNumber = scanner.nextInt();
        } while (!(usersNumber >= 5 && usersNumber <= 300));

        double squareRootFromUsersNumber =  Math.sqrt(usersNumber);
        while (counter <= squareRootFromUsersNumber) {

            if (usersNumber % counter == 0) {
                var = 1;
            }
            counter++;
        }
            if (var != 0) {
                System.out.println("El número: " + usersNumber + " no es un numero primo");
            } else {
                System.out.println("El número: " + usersNumber + "  es un numero primo");
            }
        }
    }


