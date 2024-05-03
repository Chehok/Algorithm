class Solution {
    public int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        sb1.append(Integer.toString(a));
        sb1.append(Integer.toString(b));
        sb2.append(Integer.toString(b));
        sb2.append(Integer.toString(a));
        
        return Math.max(Integer.valueOf(sb1.toString()), Integer.valueOf(sb2.toString()));
    }
}