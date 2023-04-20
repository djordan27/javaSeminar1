//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

//        Вывести все простые числа от 1 до 1000



import java.util.Scanner;

//        * +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
//        например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно
//        решение или сообщить, что его нет.
public class task1 {
    public static void main(String[] args) {
        System.out.print("Введите число для вычесления суммы: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.println(sum(count));
    }
    public static int sum(int myCount){
        int mySum = 0;
        for (int i = 1; i <= myCount; i++) {
            mySum = mySum + i;
        }
        return mySum;
    }
}
