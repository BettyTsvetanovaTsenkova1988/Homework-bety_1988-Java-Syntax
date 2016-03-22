import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersFromNToM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int n = input.nextInt();
        System.out.print("M: ");
        int m = input.nextInt();
        Random randomize = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = Math.min(n, m); i <= Math.max(n, m); i++) { //пълни листата с числата в дадения интервал
            arr.add(i);
        }

        int counter = arr.size();

        while (counter > 0) { //върти толкова пъти, колкото са числата между n и m
            int randomNumber = (randomize.nextInt(counter)); // генерира случайно число от нула до counter-а
            System.out.printf("%d ", arr.remove(randomNumber));// показва кое е числото от листата на позиция randomNumber и след това маха от листата това число, за да няма повторения
            counter--;
        }
    }
}
