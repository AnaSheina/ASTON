package homework5;

//Задание 7
/*
 * Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
 *  если число отрицательное, и вернуть false если положительное.
 * Замечание: ноль считаем положительным числом.
 */
public class Task7 {
    public static boolean WhatNumber(int a){
        if (a >= 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
