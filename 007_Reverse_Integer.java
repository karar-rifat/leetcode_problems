// Runtime 1 ms Beats 86.61% of users with Java
// Memory 40.8 MB Beats 47.51% of users with Java
class Solution_7 {
    public int reverse(int x) {
        int sign = 1;
        int result = 0;
        boolean t = false;
        int remainder = 0;

      // check if input is negative, if so make input(x) positive and make sign negative
        if(x>0){
            sign = 1;
        }else{
            sign = -1;
            x = -1 * x;
        }

      // while function would not run if x is negative, thats why we used field sign.
        while(x > 0){
            remainder = x % 10;
            x /= 10;
            if(t){
                result *= 10;
                result += remainder;
                
            }else{
              // this block run only the first time, other time we multiply the result with 10 for increase place
                result = remainder;
                t = true;
            }

          // check each time remainder is same after adding. Because if 32bit integer cross its limit it will change and make result invalid.
            if(result%10 != remainder) return 0;
            
        }
      // at last we return the value with the sign.
        return result *= sign;
        
    }
}
