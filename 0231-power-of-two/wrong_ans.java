class Solution {
    public boolean isPowerOfTwo(int n) {
        int power = 1;
        if(n == 0){
            return false;
        }
        if(n == 1){
            return true;
        } else {
            while(power <= n){
                power *= 2;
                if(power == n){
                    return true;
                }
            }
            return false;
        }
    }
}
//Get time exceeded, bcs have complexity O(log n) 
