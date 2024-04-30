class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] isSkip = new boolean[26];

        for(int i = 0; i < skip.length(); i++) isSkip[skip.charAt(i)-'a'] = true;

        char[] arr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();

        char[] target = s.toCharArray();

        for(char c : target) {
            int cur = c - 'a';
            for(int i = 0; i < index; i++){
                cur = (cur+1)%26;
                if(isSkip[cur]) i--;
            }
            sb.append(arr[cur]);
        }

        return sb.toString();
    }
}