class Solution {
    public boolean isPalindrome(int x) {
        boolean isPal = false;

        int number = x;

        if(number == 0){
            isPal = true;
            return isPal;
        }

        String numberToString = String.valueOf(x);
        String numberReverse = "";

        while(number > 0){
            numberReverse += String.valueOf((number % 10));
            number = number/10;
        }

        if(numberToString.equals(numberReverse)){
            isPal = true;
        }
        
        return isPal;
    }
}