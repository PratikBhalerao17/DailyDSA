package org.example.DailyDSA.Arrays.PrefixSum;

// Given the array find the smallest subarray length which contains both min and max in array
/*
1. Brute Force:
    calculate the min and max element
    For every min or max traverse to the right to calculate the min/max and then calculate the length
    compare with all the length and return the minimum 1
    O(N^2)
2. teh min and max must be the corner elements and the only 1 min and only 1 max must be there
    traverse the array if we get the min then store that index and traverse to right
    if anoter min is getting then update the min index to latest
    and if we get the max then cal the distance and again traverse
 */
public class SmallestMinMaxSubarray {
    public static void main(String[] args) {
//        int []arr=new int[]{5,1,2,8,1,3,4,8,6};
        int []arr=new int[]{1,1,1,1,1,1};
        //here the ans must be 4 -> 1,3,4,8s
        System.out.println("The minimum subarray length is : "+SmallestSubarray(arr));
    }
    public static int SmallestSubarray(int[] arr){
        int smallElement=Integer.MAX_VALUE;
        int largeElement=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallElement)
                smallElement=arr[i];
            if(arr[i]>largeElement)
                largeElement=arr[i];
        }
        //so now we get the largest and smallest elements
        int smallIndex=-1,largeIndex=-1,finalLength= arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==smallElement) {
                smallIndex = i;
                if(smallIndex!=-1 && largeIndex !=-1)
                    finalLength=Math.min(finalLength,smallIndex-largeIndex+1);
            }
            if(arr[i]==largeElement){
                largeIndex = i;
                if(smallIndex!=-1 && largeIndex !=-1)
                    finalLength=Math.min(finalLength,largeIndex-smallIndex+1);
            }
        }
        return finalLength;
    }
}
