/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package twosum;

/**
 *
 * @author mario
 */
public class TwoSum {

    public static void main(String[] args) {
        /**
         * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
         */
        int[] nums = {3,2,4,1};
        int[] output;
        int target = 6;
        output = twoSum(nums,target);
        
        System.out.println("Output=[" +output[0]+","+output[1]+"]");
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] output = {-1,-1};
        int suma = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                
                if (i!=j){
                    suma = nums[i] + nums[j];
                    if ( suma == target ){
                        output[0] = i;
                        output[1] = j;
                    }
                }
             }
        }
        return output;
    }
}
