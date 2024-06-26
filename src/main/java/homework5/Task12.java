package homework5;

//Задание 12
/*
 * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
 */
public class Task12 {
    public static void changeNumbersInArray(){
        int[] dock= { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i=0;i < dock.length;i++){
            if(dock[i]<6){
                dock[i]=dock[i]*2;
            }
        }
    }
}
