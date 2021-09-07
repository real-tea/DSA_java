package com.akash;

import java.util.Scanner;

public class BubbleSort
{
    public static void main(String[] args) {
        int[] array = {1,23,4,5,6,98,12,3,5};
        int[] result = Sort(array);
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(result[i]);

        }

    }
    public static int[] Sort(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0;j < array.length - 1 - i; j++)
            {
                if(array[j] < array[j + 1])
                {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }

        }
        return array;

    }

}
