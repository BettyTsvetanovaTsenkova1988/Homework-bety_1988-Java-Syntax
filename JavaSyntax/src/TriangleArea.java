import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        String a = input.nextLine();
        String[] arrA = a.split(" ");

        System.out.print("Enter b: ");
        String b = input.nextLine();
        String[] arrB = b.split(" ");

        System.out.print("Enter c: ");
        String c = input.nextLine();
        String[] arrC = c.split(" ");

        int aX = Integer.parseInt(arrA[0]);
        int aY = Integer.parseInt(arrA[1]);

        int bX = Integer.parseInt(arrB[0]);
        int bY = Integer.parseInt(arrB[1]);

        int cX = Integer.parseInt(arrC[0]);
        int cY = Integer.parseInt(arrC[1]);

        int area = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
        System.out.print("Output: ");
        System.out.println(Math.abs(area));
    }
}
