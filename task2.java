import java.util.ArrayList;

//        Вывести все простые числа от 1 до 1000
public class task2 {
    public  static ArrayList <Integer>  arraySimpleNumbers = new ArrayList<>();
    public static void main(String[] args) {
    //int [] arraySimpleNumbers = simpleNumbers();
        //task2 task = new task2();
        arraySimpleNumbers = simpleNumbers();
        new task2().printArray(arraySimpleNumbers);
        //task2.arraySimpleNumbers = simpleNumbers();
        //ArrayList <Integer>  arraySimpleNumbersNonStatic = arraySimpleNumbers;
        //task2.arraySimpleNumbers = arraySimpleNumbersNonStatic;
        //task2.printArray(simpleNumbers());
    }
    public  static ArrayList<Integer> simpleNumbers () {
        arraySimpleNumbers = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            int count = 0;
            for (int j = 2 ; j <= i ; j++) {
                if(i % j == 0) count++;
            }
            if (count == 1) arraySimpleNumbers.add(i);
        }
        return arraySimpleNumbers;
    }
    public  void printArray(ArrayList<Integer> array){
        int newLine = 0;
        for (int i = 0; i < array.size(); i++) {
            if (newLine > 10){
                System.out.println();
                newLine = 0;
            }
            newLine++;
            System.out.print(array.get(i) + " ");
        }
    }
}
