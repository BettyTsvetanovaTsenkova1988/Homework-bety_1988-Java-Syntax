import java.util.Scanner;

public class ConvertFromDecimalSystemToBase7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Decimal: ");
        int n = input.nextInt();
        System.out.print("Base-7: ");
        System.out.println(Integer.toString(n, 7));

    }
}
