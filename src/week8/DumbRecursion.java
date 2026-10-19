package week8;

import java.util.ArrayList;
import java.util.Arrays;

public class DumbRecursion{
    public static int sumHelper(int loc,ArrayList<Integer> nums){
        if (loc==nums.size()){
            return 0;
        } 
        return nums.get(loc)+sumHelper(loc+1, nums);
        
    }
    public static int sum(ArrayList<Integer> nums){
        return sumHelper(0, nums);
    }
    public static int sumTailHelper(int total,int loc,ArrayList<Integer> nums){
        if (loc==nums.size()){
            return total;
        }
        return sumTailHelper(total+nums.get(loc), loc+1, nums);
    }
    public static int sumTail(ArrayList<Integer> nums){
        return sumTailHelper(0, 0, nums);
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList(Arrays.asList(1,2,3,4,5,6));
        int total=sum(nums);
    }
}