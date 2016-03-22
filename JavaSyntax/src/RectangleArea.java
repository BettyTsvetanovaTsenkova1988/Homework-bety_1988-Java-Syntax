import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int area = a * b;
        System.out.print("Output: ");
        System.out.println(area);
    }
}
