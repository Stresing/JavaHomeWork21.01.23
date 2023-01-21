import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        task2();

    }

    static void task1() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);5
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }

    static void task2() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mult = 1; // multiplication
        for (int i = 1; i <= n; i++) {
            mult = mult * i;
        }
        System.out.println(mult);
    }
}
