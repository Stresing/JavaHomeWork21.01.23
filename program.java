import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        task3();

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

    static void task3() {
        int n = 1000;
        boolean check = true;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
            else{
                check = true;
            }
        }
        
    }
}
