import java.util.Scanner;

public class CalculateExpression {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();
        double f1 = ((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2)));
        double formula1 = Math.pow(f1, ((a + b + c) / Math.sqrt(c)));
        double f2 = Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3);
        double formula2 = Math.pow(f2, (a - b));
        double diff = ((a + b + c) / 3) - ((formula1 + formula2) / 2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",
                formula1, formula2, Math.abs(diff));



    }

}
