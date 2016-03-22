import java.util.Scanner;

public class ConvertFromBase7ToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Base-7: ");
        int n = Integer.parseInt(input.nextLine(), 7);
        System.out.print("Decimal: ");
        System.out.println(Integer.toString(n, 10));
    }
}
