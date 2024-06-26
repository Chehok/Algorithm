class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for(int i: num_list) {
            if(i % 2 == 0) {
                even.append(Integer.toString(i));
            } else {
                odd.append(Integer.toString(i));
            }
        }
        
        return Integer.valueOf(odd.toString()) + Integer.valueOf(even.toString());
    }
}