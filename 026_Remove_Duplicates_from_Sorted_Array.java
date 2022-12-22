// Runtime 1 ms Beats 100%
// Memory 44.3 MB Beats 78.13%

class Solution_026{
    public int removeDuplicates(int[] nums) {
        int setPosition = 1;
        int currentNum = nums[0];
        for(int i : nums){
            if(i != currentNum){
                nums[setPosition] = i;
                currentNum=i;
                setPosition++;
            }
        }
        for(int i : nums){
            System.out.println(i);
        }
        return setPosition;
    }
    public static void main(String[] args){
        Solution_026 s = new Solution_026();
        int[] v = new int[] {1,1,2};
        System.out.println(
                s.removeDuplicates(v)
        );
//        for(int i: v){
//            System.out.println(i);
//        }
    }
}