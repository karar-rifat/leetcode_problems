// Runtime 0 ms Beats 100%
// Memory 42.5 MB Beats 50.71%

class Solution_27{
    public int removeElement(int[] nums, int val) {
        int c = 0;
        int length = nums.length;

        for (int i=0; i<length; i++){
            if(nums[i] != val){
                nums[c++] = nums[i];
            }
        }
        return c;
    }

//    [0,1,2,2,3,0,4,2] || val= 2
//
    public static void main(String[] args){
        Solution_27 s = new Solution_27();
        System.out.println(
                s.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2)
        );
    }
}