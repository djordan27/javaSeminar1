import java.util.Scanner;

//        Реализовать простой калькулятор
public class task3 {
    public static void main(String[] args) {
        System.out.print("Введите ваше выражение через пробел: ");
        result(expression());
     }

    public static void result (String []scanArray) {
        System.out.print(
                scanArray[0] +" "+ scanArray[1]+" " + scanArray[2] + " = "
        );
        int a = getNumbers(scanArray[0]);
        int b = getNumbers(scanArray[2]);
        switch (scanArray[1]) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b != 0) {
                    float resultOfDivision = (float) a / b;
                    System.out.println(resultOfDivision);
                } else {
                    System.out.print("java  не может делить на ноль, вы можете попробовать еще раз: ");
                    result(expression());
                }
        }
    }
    public static String [] expression(){
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String [] arrayLine = numbers.split(" ");
        return arrayLine;
        }

        public static int getNumbers(String number) {
        int getNumber = 0;
        try{
            getNumber = Integer.parseInt(number);

        } catch (NumberFormatException e) {
            System.out.println("Вы должны ввести число, вы можете попробовать еще раз");
            result(expression());
        }
            return getNumber;
        }

    }

