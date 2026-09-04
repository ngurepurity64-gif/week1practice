import java.util.Scanner;
public class countdown {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a starting number: ");
            int number = input.nextInt();

            // Count down until we reach zero
            while (number >= 0) {
                System.out.println(number);
                number--;
            }

            System.out.println("Countdown finished!");

            input.close();
        }
    }

