package homework5;

//Задание 8
/*
 * Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
 *  в консоль указанную строку, указанное количество раз
 */
public class Task8 {
    public static void printText(String text,int a){
        for (int i=0;i<a;i++){
            System.out.println(text);
        }
    }
}
