// Runtime 0 ms Beats 100%
// Memory 41.1 MB Beats 74.81%

class Solution_66{
    public int[] plusOne(int[] digits) {
        int endPoint = digits.length-1;
        if(digits[endPoint] != 9){
            digits[endPoint] = digits[endPoint] + 1;
            return digits;
        }else {
            while(endPoint>=0 && digits[endPoint] == 9){
                digits[endPoint] = 0;
                endPoint--;
            }
            if(digits[0] == 0){
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;
                return newArray;
            }else {
                digits[endPoint] = digits[endPoint] + 1;
            }

        }
        return digits;

    }

    public static void main(String[] args){
        Solution_66 s = new Solution_66();
        int[] digits = {9,9};

        int[] returned = s.plusOne(digits);
        for(int i: returned){
            System.out.println(i);
        }
    }
}