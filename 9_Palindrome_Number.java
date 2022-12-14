class Solution_9 {
    public boolean isPalindrome(int x) {
        int count = 0;
        int inputClone = x;
        if(x < 0){
            return false;
        }
        while(x > 0){ //O(n) complexity
            x /= 10;
            count++;
        }
        int reduced = 0;
        for(int i=1; i<=count/2; i++){ //O(n/2) == O(n) complexity
            int last = inputClone % 10;
            int first = (int) (inputClone / Math.pow(10, count-1-reduced));
            System.out.println("first: " + first +",last: " + last + ",i: " + i);
            if(first != last){
                return false;
            }
            inputClone %= Math.pow(10, count-1-reduced);
            inputClone /= 10;
            reduced += 2;
            System.out.println(inputClone);
        }
        return true;

    }
}