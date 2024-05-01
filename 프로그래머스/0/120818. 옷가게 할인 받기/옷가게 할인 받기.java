class Solution {
    public int solution(int price) {
        if(100000 <= price && price < 300000) {
            return price * 19 / 20;
        } else if (300000 <= price && price < 500000) {
            return price * 9 / 10;
        } else if (500000 <= price) {
            return price * 4 / 5;
        }
        return price;
    }
}