// Runtime 95 ms Beats 20.98%
// Memory 44.6 MB Beats 67.71%

class Solution_1 {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target) return new int[] {i,j};
            }
        }
        return new int[] {0,0};
    }
}