class Solution {
    public boolean isPalindrome(int x) {
        int temp =0; 
        int xCopy=x; 
        while(x>0){
            int remainder = x % 10; 
            temp = temp * 10 + remainder; 
            x/=10;
        }
        return temp==xCopy;
    }
}