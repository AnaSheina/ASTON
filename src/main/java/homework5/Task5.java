package homework5;

//Задание 5
/*Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
*/
public class Task5 {
    public static boolean compareSum(int a,int b){
        if ((a+b>=10) & (a+b<=20)) {
            return true;
        }
        else {
            return false;
        }
    }
}