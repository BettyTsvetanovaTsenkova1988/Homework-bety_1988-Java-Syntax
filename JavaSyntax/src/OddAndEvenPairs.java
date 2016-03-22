import java.text.BreakIterator;
import java.util.Scanner;

public class OddAndEvenPairs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String textInput = input.nextLine();
        String[] text = textInput.split(" ");
        int[] array = new int[text.length];

        if (array.length % 2 != 0) {
            System.out.println("Invalid length");
            return;
        }

        for (int i = 0; i < array.length - 1; i += 2) {
            array[i] = Integer.parseInt(text[i]);
            array[i + 1] = Integer.parseInt(text[i + 1]);

            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0) {
                System.out.printf("%d, %d -> both are even", array[i], array[i + 1]);
                System.out.println();
            } else if (array[i] % 2 == 0 && array[i + 1] % 2 != 0) {
                System.out.printf("%d, %d -> different", array[i], array[i + 1]);
                System.out.println();
            } else if (array[i] % 2 != 0 && array[i + 1] % 2 == 0) {
                System.out.printf("%d, %d -> different", array[i], array[i + 1]);
                System.out.println();
            } else if (array[i] % 2 != 0 && array[i + 1] % 2 != 0) {
                System.out.printf("%d, %d -> both are odd", array[i], array[i + 1]);
                System.out.println();
            }
        }
    }
}
