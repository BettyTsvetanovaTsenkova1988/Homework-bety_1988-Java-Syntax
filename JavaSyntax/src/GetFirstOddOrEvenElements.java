import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String text = input.nextLine();
        String[] arr = text.split(" ");
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }

        String numberOfElements = input.nextLine();
        String[] getNumber = numberOfElements.split(" ");
        System.out.println("Output: ");
        System.out.println(findOddOrEvenElements(array, getNumber));
    }

    public static String findOddOrEvenElements(int[] numbers, String[] extractNumber) {
        StringBuilder odd = new StringBuilder();
        int n = Integer.parseInt(extractNumber[1]); // взема от входа колко числа да се отпечатат

        for (int i = 0; i < numbers.length; i++) {

            if (extractNumber[2].equals("odd")) {
                if (numbers[i] % 2 != 0) {
                    odd.append(numbers[i] + " ");
                }
            }
            if (extractNumber[2].equals("even")) {
                if (numbers[i] % 2 == 0) {
                    odd.append(numbers[i] + " ");
                }
            }
        }
        if (odd.length() >= n) {
            odd.substring(0, n);
            return odd.toString();
        } else {
            return odd.toString();
        }
    }
}
