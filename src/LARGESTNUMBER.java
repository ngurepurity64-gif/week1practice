public class LARGESTNUMBER {
    public static void main(String[] args) {
        int[] numbers = {15, 8, 25, 10, 20};
        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest = " + largest);
    }
}