// Runtime 41 ms Beats 9.44%
// Memory 39.7 MB Beats 84.50%

class Solution_69{
    public int mySqrt(int x) {
        long counter = 0;
        if(x == 0) return 0;
        while(counter*counter <= x){
            counter++;
        }
        return (int)--counter ;
    }

    public static void main(String[] args) {
        Solution_69 s = new Solution_69();
        System.out.println(
                s.mySqrt(2147395600)
//                Integer.MAX_VALUE
        );
    }
}