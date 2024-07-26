package org.example.DailyDSA.Arrays.Easy;

//Statement:
// Count the total numbers in the array with at least one element greater than itself


//Solution: Except greatest element every number has at least one element greater than itself.
//Count the frequency of greatest element
// return N-count
public class AtLeastOneElementGreater {
    public static void main(String[] args) {
        int arr[]=new int[]{-3,-2,6,8,4,8,5};
        System.out.println(CountAtLeastOneElementGreater(arr));
    }
    public static int CountAtLeastOneElementGreater(int[] arr){
        int max=Integer.MIN_VALUE;
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
                count=1;
            }
            else if (max==arr[i])
                count++;
        }
        return arr.length-count;
    }
    //Time complexity : O(N)
    //Space Complexity : O(1)
}
