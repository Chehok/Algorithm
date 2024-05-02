class Solution {
    public String solution(String my_string) {
        String[] aeiou = { "a", "e", "i", "o", "u" };
        
        for(String s: aeiou) {
            my_string = my_string.replaceAll(s, "");
        }
        
        return my_string;
    }
}