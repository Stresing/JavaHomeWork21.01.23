import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        task4();
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
                System.out.printf("Ответ: %d", x + y);
                break;
            case "-":
                System.out.printf("Ответ: %d", x - y);
                break;
            case "/":
            Double res = (double)x/(double)y;
                System.out.printf("Ответ: %f", res);
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

//     static void task5() {  //не закончил
//         Scanner scanner = new Scanner(System.in); 
//         String prim = scanner.nextLine(); // 5?+7?=127
//         String[] arrNum = equationSplit(prim);
//         for (int i = 0; i < arrNum.length; i++) {
//             System.out.println(arrNum[i]);
             
//         }

//     }

//     static String[] equationSplit(String str){
//         String someStroke = str;
//         String someArr[] = someStroke.split("[+=]");
        
//         return someArr;
        
//     }
// }
/*
 * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
 * заменены знаком вопроса, например 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства.
 * Предложить хотя бы одно решение или сообщить, что его нет.
 * 
 * 
 * разделение на строки 5?, 7?, 127
 */
