package org.example.DailyDSA.Arrays.Easy;

// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

import java.util.Arrays;
import java.util.Scanner;

/*
Input: nums = [1,2,3,4,5,6,7], k = 3
after step 1 --> [7,1,2,3,4,5,6]
after step 2 --> [6,7,1,2,3,4,5]
after step 3 --> [5,6,7,1,2,3,4]

so here we observed that after 3 steps the last 3 digits becomes first 3 digits
and first 4 digits becomes last 4 digits

1. First we reverse the entire array
[7,6,5,4,3,2,1]
2. after that we reverse first k digits in this case first 3 digits
[5,6,7,4,3,2,1]
3.After that we reverse last N-k digits in this case 4
 [5,6,7,1,2,3,4]

 Here as we observed that the after every k times we get same digits
 like for k=0,k=7,k=14 we get same results and if we try to access big values of k then we get
 ArrayIndexOutOfBounds exception

 so first revive k value like k=k%N;


 */
public class RotateArayRight {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the value of K : ");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int N=arr.length;
        k=k%N;
        reverse(0,N-1,arr);
        reverse(0,k-1,arr);
        reverse(k,N-1,arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int s,int e,int [] arr){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
