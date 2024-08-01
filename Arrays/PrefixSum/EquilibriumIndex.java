package org.example.DailyDSA.Arrays.PrefixSum;

public class EquilibriumIndex {

    public static void main(String[] args) {
        int arr[]=new int[]{1,7,3,6,5,6};
        System.out.print("The pivot index is : "+ pivotIndex(arr));


    }
        public static int pivotIndex(int[] nums) {
            //If there is only 1 element it is already pivot
      /*
       0 1 2 3 4 5
      [1,7,3,6,5,6]
      for 0th index left sum is 0
      for (n-1)th index the right sum is 0

      Outer loop: N
      Left Inner loop 1:  0+1+2+3+4+5+...+N N(N+1)/2 ==> N^2
      Right Inner loop 1: N+...+5+4+3+2+1+0 N(N+1)/2 ==> N^2
      TC: N^2+N^2 ==N^2
                 [1,7,3,6,5,6]
      Sum Array: [1,8,11,17,22,28]
      Right Sum[0]=28-1=27
      Right Sum[1]=28-8=20
      */

            int [] sumArray=new int[nums.length];
            sumArray[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                sumArray[i]=nums[i]+sumArray[i-1];
            }
            for(int i=0;i<nums.length;i++){
                int leftSum=0,rightSum=0;
                if(i==0)
                    rightSum=sumArray[nums.length-1]-nums[0];
                else if(i==nums.length-1)
                    leftSum=sumArray[i]-nums[i];
                else{
                    leftSum=sumArray[i-1];
                    rightSum=sumArray[nums.length-1]-sumArray[i];
                }
                if(leftSum==rightSum)
                    return i;
            }

            return -1;

        }
}
