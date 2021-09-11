package com.akash;

import java.util.Scanner;

public class Selection_sort {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array and then input array");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();

        }
        sort(arr,n);

    }

    public static void sort(int[] arr,int n)
    {
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for(int j = i + 1; j < n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        for(int i = 0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
