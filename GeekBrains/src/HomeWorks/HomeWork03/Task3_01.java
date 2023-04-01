package HomeWorks.HomeWork03;

import static HomeWorks.Utilities.makeRandomArray;
import static HomeWorks.Utilities.printArrayInt;


/**
 * Реализовать алгоритм сортировки слиянием
 */
public class Task3_01 {

    public void start() {
        int[] array = makeRandomArray(16);
        System.out.println("Стартовый массив:");
        printArrayInt(array);

        int[] sortedArray = mergeSort(array);
        System.out.println("Отсортированный массив:");
        printArrayInt(sortedArray);
    }

    private int[] mergeSort(int[] array) {

        if (array == null) {
            return null;
        }

        boolean flag = array.length < 2;

        if (flag) {
            return array;
        }

        int lengthLeft = array.length / 2;
        int lengthRight = array.length - lengthLeft;

        int[] arrayLeft = new int[lengthLeft];
        System.arraycopy(array, 0, arrayLeft, 0, lengthLeft);

        int[] arrayRight = new int[lengthRight];
        System.arraycopy(array, lengthLeft, arrayRight, 0, lengthRight);

        arrayLeft = mergeSort(arrayLeft);
        arrayRight = mergeSort(arrayRight);

        return mergeArray(arrayLeft, arrayRight);
    }

    private static int[] mergeArray(int[] arrayLeft, int[] arrayRight) {

        int arrayLength = arrayLeft.length + arrayRight.length;
        int[] arrayResult = new int[arrayLength];

        int positionLeft = 0;
        int positionRight = 0;

        for (int i = 0; i < arrayResult.length; i++) {
            if (positionLeft == arrayLeft.length) {
                arrayResult[i] = arrayRight[positionRight];
                positionRight++;
            } else if (positionRight == arrayRight.length) {
                arrayResult[i] = arrayLeft[positionLeft];
                positionLeft++;
            } else if (arrayLeft[positionLeft] < arrayRight[positionRight]) {
                arrayResult[i] = arrayLeft[positionLeft];
                positionLeft++;
            } else {
                arrayResult[i] = arrayRight[positionRight];
                positionRight++;
            }
        }

        return arrayResult;
    }
}