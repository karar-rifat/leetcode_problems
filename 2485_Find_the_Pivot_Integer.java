class Solution_2485 {
    public int pivotInteger(int n) {
        int x = 1;
        int y = n;
        int xSum = 0;
        int ySum = 0;

        if(n==1) return 1;
      
      // [1,2,3,4,5,6,7,8]
      // xSum will go from left to right adding sum, ySum will go from right to left adding sum, they dont cross each other.

        while (x < y || x != y){
            if(xSum <= ySum){
                xSum += x;
                x += 1;
            }else{
                ySum += y;
                y -= 1;
            }
            if(xSum == ySum && x==y){
                return x;
            }
        }
        return -1;
    }
}
