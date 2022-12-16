import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Solution_169{
    public int majorityElement(int[] nums) {
        int c = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                if(i-c+1>nums.length/2){
                    return nums[i];
                }
                c = i+1;
            }
        }
        return nums[nums.length-1];

    }

    public static void main(String[] args){
        Solution_169 s = new Solution_169();
        System.out.println(
                s.majorityElement(new int[] {2,2,1,1,1,2,2})
        );
    }
}