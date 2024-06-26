import static homework5.Task1.printThreeWords;
import static homework5.Task10.changeArray;
import static homework5.Task11.fillArray;
import static homework5.Task12.changeNumbersInArray;
import static homework5.Task13.diogonalArray;
import static homework5.Task14.returnArray;
import static homework5.Task2.checkSumSign;
import static homework5.Task3.printColor;
import static homework5.Task4.compareNumbers;
import static homework5.Task5.compareSum;
import static homework5.Task6.printWhatNumber;
import static homework5.Task7.WhatNumber;
import static homework5.Task8.printText;
import static homework5.Task9.printWhatYear;

public class Main {
    public static void main(String[] args) {

        printThreeWords();//1
        checkSumSign();//2
        printColor();//3
        compareNumbers();//4
        compareSum(4,7);//5
        printWhatNumber(7);//6
        WhatNumber(4);//7
        printText("Hi,dude",5);//8
        printWhatYear(4);//9
        changeArray();//10
        fillArray();//11
        changeNumbersInArray();//12
        diogonalArray();//13
        returnArray(7,0);//14
    }
}