// You are given an array of n numbers and a number "tar" as the input.
// You have to calculate and print all subsets of the given elements, the contents of which sum to "tar".
// Say, if you are given an array 10,20,30,40,50 and the target is 60. Then all the valid subsets are [10,20,30],[10,50] and [20,40].

// We want you to try to think of an algorithm for this question.

// *Hint: When you reach the base case you would already have a subset with you. Check whether the sum of that subset is equal to the target.

// An array of n elements has 2n subsets. It is so because every element has an option of whether to be included or not in that subset.

public class TargetSumSubset {
    public static void main(String[] args) {

        int arr[]=new int[]{10,20,30,40,50,60};
        int tar=60;

        TarSum(arr,0,tar,0,"");
        
    }

    public static void TarSum(int [] arr,int index , int tar , int ssf, String set ){

        if(index==arr.length){
            if(ssf==tar){
                System.out.println(set.substring(0,set.length()-1));
                return;
            }else{
                return;
            }
            
        }

        // 10 added to subset
        TarSum(arr,index+1,tar, ssf+arr[index], set+arr[index]+",");
        // 10 not added to subset
        TarSum(arr,index+1,tar, ssf, set);

    }
}
