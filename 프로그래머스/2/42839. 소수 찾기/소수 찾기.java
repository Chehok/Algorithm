import java.util.HashSet;

class Solution {
    HashSet<Integer> set = new HashSet<>();
    boolean[] visited = new boolean[7];
    
    public int solution(String numbers) {
        int answer = 0;
        dfs(numbers, "", 0);
        
        for(Integer i: set) {
            if(isPrime(i))
                answer++;
        }
        
        return answer;
    }
    
    private void dfs(String numbers, String now, int depth) {
        if(depth >= numbers.length()) {
            return ;
        }
        
        for(int i = 0; i < numbers.length(); i++) {
            if(!visited[i]){
                visited[i] = true;
                dfs(numbers, now + numbers.charAt(i), depth + 1);
                set.add(Integer.parseInt(now + numbers.charAt(i)));
                visited[i] = false;
            }
        }
    }
    
    private boolean isPrime(int n) {
        if(n < 2)
            return false;
        
        for(int i = 2; i <= (int) Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}