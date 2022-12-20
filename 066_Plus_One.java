class Solution_66{

    // not completed
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int endPoint = digits.length-1;
        if(endPoint != 9){
            digits[endPoint] = digits[endPoint] + 1;
            return digits;
        }else {
            carry = 1;
            while(carry>0){
                digits[endPoint] = 0;
                endPoint--;
                carry = 1;
            }

        }
        return new int[] {1,2,3};
    }

    public static void main(String[] args){
        Solution_66 s = new Solution_66();
        int[] digits = {1,2,3};

        s.plusOne(digits);
        for(int i: digits){
            System.out.println(i);
        }
    }
}