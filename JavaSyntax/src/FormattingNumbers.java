import java.util.Scanner;

public class FormattingNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        float b = input.nextFloat();
        System.out.print("c: ");
        float c = input.nextFloat();

        System.out.println("Output: ");
        System.out.printf("|%1$-10X|", a);
        System.out.printf(String.format("%010d", Integer.parseInt(Integer.toBinaryString(a))));
        System.out.printf("|%1$10.2f|%2$-10.3f|", b, c);
    }
}
