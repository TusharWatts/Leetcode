/*
* https://leetcode.com/problems/binary-search
*
* Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. 
* Otherwise, return -1
*/

class Solution {
    
    public int search(int[] nums, int target) {
        
        return searchHelper(nums, target, 0, nums.length-1);     

    }
    
    
    public int searchHelper(int[] nums, int target, int left, int right){
        
        if(left > right) return -1;
        
        int mid = (left + right)/2;
        int midVal = nums[mid];
        
        if(midVal == target){
            return mid;
        }
        else if(target < midVal){
            return searchHelper(nums, target, left, mid-1);
        }
        else{
            return searchHelper(nums, target, mid+1, right);
        }
        
        
    }
    
    
}
