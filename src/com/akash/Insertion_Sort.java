package com.akash;

import java.util.Scanner;

public class Insertion_Sort
{
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array and array elements");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
        sort(array,n);

    }

    public static void sort(int[] array,int n)
    {
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j > 0 ; j--)
            {
                if(array[j]<array[j - 1])
                {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] =temp;
                }else break;

            }

        }
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }

    }

}
