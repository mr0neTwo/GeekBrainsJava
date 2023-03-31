package HomeWorks.HomeWork02;

import HomeWorks.OperationLogger;

import java.util.Arrays;

import static HomeWorks.Utilities.makeRandomArray;

public class Task2_02 {

    private final OperationLogger _operationLogger;

    Task2_02(){
        _operationLogger = new OperationLogger("Task02Logger", "Task02Logs.log");
    }

    public void start() {
        int[] array = makeRandomArray(20);
        int[] sortedArray = bubbleSorting(array); // не знаю зачем вернул отсортированный массив, как будто так правильней)
    }

    public int[] bubbleSorting(int[] array){

        _operationLogger.addInfoLog(Arrays.toString(array));

        for (int i = array.length - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            _operationLogger.addInfoLog(Arrays.toString(array));
        }

        return array;
    }
}

