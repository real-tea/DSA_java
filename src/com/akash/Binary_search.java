package com.akash;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Binary_search {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n;
        System.out.println("enter size");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();

        }
        int answer = BinarySearch(arr,n);
        System.out.println(answer);
    }
    public static int BinarySearch(int[] array,int n)
    {
        int low = 0,high = n;
        System.out.println("Enter target element");
        int target = sc.nextInt();
        while(low<=high)
        {
            int mid = (high - low)/2;
            if(target < array[mid] )
                high = mid - 1;
            else if (target > array[mid])
            {
                low = mid + 1;
            }else {return mid + 1;}


        }
        return -1;

    }





}
