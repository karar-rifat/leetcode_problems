class Solution_930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            int j = i;
            while(sum <= goal && j<nums.length){
                sum += nums[j];
                j++;
                if(sum == goal){
                    count++;
                }
            }
        }
        return count;
    }
}
