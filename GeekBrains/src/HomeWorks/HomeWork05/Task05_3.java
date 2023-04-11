package HomeWorks.HomeWork05;

import java.util.Arrays;

import static HomeWorks.Utilities.makeRandomArray;
import static HomeWorks.Utilities.printArrayInt;

public class Task05_3 {

    public void start(){
        int[] array = makeRandomArray(20);
        printArrayInt(array);

        heapSort(array);
        printArrayInt(array);
    }

    public void heapSort(int[] array)
    {
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);

        for (int i=array.length-1; i>=0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    public void heapify(int[] array, int n, int i)
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest])
            largest = left;


        if (right < n && array[right] > array[largest])
            largest = right;


        if (largest != i)
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;


            heapify(array, n, largest);
        }
    }
    }

