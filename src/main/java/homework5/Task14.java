package homework5;
import java.util.Arrays;

//Задание 14
/*
 * Написать метод, принимающий на вход два аргумента: len и initialValue,
 *  и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
 */
public class Task14 {
    public static int[] returnArray(int len,int initialValue){
        int[] dock=new int [len];
        Arrays.fill(dock,initialValue);
        return dock;
    }
}