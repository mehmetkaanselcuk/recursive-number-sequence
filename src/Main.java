import java.util.Scanner;

public class Main {

    static void problem(int n) {
        System.out.print(n + " ");
        if (n <= 0) return;
        problem(n - 5);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        problem(n);
    }
}