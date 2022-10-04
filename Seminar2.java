import java.io.FileNotFoundException;
import java.util.Scanner;

public class Seminar2 {
    public static void main(String[] args){
    // // Задание 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
    // // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
    // // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    // Scanner sc = new Scanner(System.in);
    // double i = 0;
    // System.out.print("Введите вещественное число: ");
    // if(sc.hasNextDouble()) {
    //     i = sc.nextDouble();
    //     System.out.println(i);
    // } else {
    //       System.out.println("Введите корректный формат данных");
    //     }
    //     sc.close();
    // //Задание 2. Поправить код по необходимости
    // int d = 0;
    // int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};
    // try {
    //     double catchedRes1 = intArray[8] / d;
    //     System.out.println("catchedRes1 = " + catchedRes1);
    //  } 
    //  catch (ArithmeticException e) {
    //     System.out.println("Catching exception: " + e);
    //  }
     //Задание 3. Поправить код по необходимости
    //  public static void main(String[] args) throws Exception {
    //     try {
    //         int a = 90;
    //         int b = 3;
    //         System.out.println(a / b);
    //         printSum(23, 234);
    //         int[] abc = {1, 2};
    //         abc[3] = 9;
    //     } 
    //      catch (NullPointerException ex) {
    //         System.out.println("Указатель не может указывать на null!");
    //     } catch (IndexOutOfBoundsException ex) {
    //         System.out.println("Массив выходит за пределы своего размера!");
    //     } catch (Throwable ex) {
    //         System.out.println("Что-то пошло не так...");
    //     }

    
    //  }
    //  public static int printSum(Integer a, Integer b) throws FileNotFoundException {
    //     return a + b;
    //  }
     
// }
// Задание 4.Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
Scanner in = new Scanner(System.in);
String string = in.nextLine();
string = string.trim();
in.close();
if(string.isEmpty())
    throw new IllegalArgumentException("Строка пустая!");
else
    System.out.println(string);
    
}

}




