import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        task1();

    }

    static void task1() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
