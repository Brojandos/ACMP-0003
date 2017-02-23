import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt() / 10;
        System.out.println((number > 0? number * (number + 1) : "") + "25");
    }
}