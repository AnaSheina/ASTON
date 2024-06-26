package homework5;

//Задание 10
/*
 * Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 *  С помощью цикла и условия заменить 0 на 1, 1 на 0
 */
public class Task10 {
    public static void changeArray(){
        int[] dock={1,0,0,1,0,1};
        for (int i=0;i < dock.length;i++){
            if (dock[i]==1){
                dock[i]=0;
            }
            else {
                dock[i]=1;
            }
        }
    }
}
