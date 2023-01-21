import java.util.Scanner;

public class program {
    public static void main(String[] args) {
 task5();
    }

    static void task1() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
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
        scanner.close();
        int multi = 1; // multiplication
        for (int i = 1; i <= n; i++) {
            multi = multi * i;
        }
        System.out.println(multi);
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
            } else {
                check = true;
            }
        }
    }

    static void task4() {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.println("Введите знак операции['+', '-', '*', '/', '%']: ");
        char sign = scanner.next().charAt(0);
        String signString = String.valueOf(sign);
        System.out.println("Введите второе число: ");
        int y = scanner.nextInt();
        scanner.close();
            switch (signString) {
                case "+":
                    System.out.printf("Ответ: %d", x+y);
                    break;
                case "-":
                    System.out.printf("Ответ: %d", x - y);
                    break;
                case "/":
                    System.out.printf("Ответ: %d", x / y);
                    break;
                case "*":
                    System.out.printf("Ответ: %d", x * y);
                    break;
                case "%":
                    System.out.printf("Ответ: %d", x % y);
                    break;
                default:
                    System.out.println("Данный знак операции отсутствует");
        }
    }
    static void task5(){
        Scanner scanner = new Scanner(System.in);
        String prim = scanner.nextLine(); //5?+7?=127
        if (prim.indexOf("?")!=-1) {
            System.out.println("там есть вопрос");
            
        }
        else{
            System.out.println("вопроса нет");
        }
        
    }
}
