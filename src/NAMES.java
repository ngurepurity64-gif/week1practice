import java.util.Scanner;

    public class NAMES{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            String[] names = new String[3];

            for (int i = 0; i < 3; i++) {
                System.out.print("Enter name: ");
                names[i] = input.nextLine();
            }

            System.out.println("Names entered:");

            for (int i = 0; i < 3; i++) {
                System.out.println(names[i]);
            }
        }
    }


