import homework8.MyArrayDataException;
import homework8.MyArraySizeException;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        //корректный массив
        String[][] arr1 = {
                {"5", "4", "2", "3"},
                {"7", "8", "1", "3"},
                {"9", "3", "5", "6"},
                {"0", "2", "3", "2"}
        };
        //некорректные массивы
        //неверный размер массива
        String[][] arr2 = {
                {"5", "4", "2", "3"},
                {"7", "8", "1", "3"},
                {"9", "3", "5", "6"}
        };
        //неверные данные в массиве
        String[][] arr3 = {
                {"5", "4", "6", "3"},
                {"7", "seven", "1", "3"},
                {"9", "3", "8", "6"},
                {"0", "2", "3", "2"}
        };

        //Вызываем метод суммировния элементов массива
        System.out.print("Массив arr1: ");
        ArrayControl(arr1);

        System.out.print("Массив arr2: ");
        ArrayControl(arr2);

        System.out.print("Массив arr3: ");
        ArrayControl(arr3);
    }

    public static void ArrayControl(String[][] arr) {
        try {
            System.out.println("Сумма всех элементов массива: " + ArrayFunc(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка в массиве: " + e.getMessage());
        }
    }

    public static int ArrayFunc(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if ((arr.length != 4) || (arr[0].length != 4)) {
            throw new MyArraySizeException("Массив неверного размера " + arr.length + "*" + arr[0].length + ". Должен быть массив 4*4.");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "] - \"" + arr[i][j] + "\".");
                }

            }
        }
        return sum;
    }
}