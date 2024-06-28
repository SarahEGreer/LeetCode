

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int candy: candies){
            if(candy > max){
                max = candy;
            }
        }
        List<Boolean> isGreatest = new ArrayList<>();


        for(int candy : candies){
            isGreatest.add(candy + extraCandies >= max);
        }

        return isGreatest;
    }
}