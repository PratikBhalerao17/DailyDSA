package org.example.DailyDSA.Arrays.PrefixSum;

// return the count of g after a in subsequent steps
public class CountAGPairs {
    /*
Here 1 approach is brute force: for every a traverse to the right and if g is found increment the count.
O(N^2)

In second approach,
keep the count of "a" as we found while travesring and if a "g" is found it can make pairs with all the
"a" to the left so increment the count with the value of "a"
     */
    public static void main(String[] args) {
        String str="bcaggaag";
        System.out.println("The count is : "+countPairs(str));
    }
    public static int countPairs(String str){
        int count=0,countA=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='a')
                countA++;
            if (str.charAt(i)=='g'){
                count+=countA;

            }
        }
        return count;
    }
}
