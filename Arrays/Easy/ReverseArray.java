package org.example.DailyDSA.Arrays.Easy;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]=new int[]{-3,-2,6,8,4,8,5};
        System.out.print("Array Before Reverse :");
        for(int a:arr)
            System.out.print(a);
        System.out.println();
        reverseString(arr);
    }
    public static void reverseString(int[] arr) {
        int s=0,e=arr.length-1;
        while (s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        System.out.print("Array After Reverse :");
        for(int a:arr)
            System.out.print(a);
    }
    //Time complexity : O(N)
    //Space Complexity : O(1)
}
