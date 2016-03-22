import java.util.Scanner;

public class CharacterMultiplier {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String[] textInput = input.nextLine().split(" ");
        String first = textInput[0];
        String second = textInput[1];

        System.out.print("Output: ");
        System.out.println(multiplyCharacters(first, second));
    }

    public static int multiplyCharacters(String one, String two) {

        int sum = 0;
        int minLenght = Math.min(one.length(), two.length());
        int maxLenght = Math.max(one.length(), two.length());

        for (int i = 0; i < minLenght; i++) {
            sum += (one.charAt(i) * two.charAt(i));
        }

        if (minLenght < maxLenght) {
            for (int i = minLenght; i < maxLenght; i++) {

                if (maxLenght == two.length()) {
                    sum += two.charAt(i);
                } else {
                    sum += one.charAt(i);
                }
            }
        }
        return sum;
    }
}













