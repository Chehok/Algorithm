class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < answer.length; i++) {
            boolean flag = false;
            answer[i] = 1_000_000;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(arr[j] > queries[i][2]) {
                    flag = true;
                    if(answer[i] > arr[j]) answer[i] = arr[j];
                }
            }
            if(!flag) answer[i] = -1;
        }
        
        return answer;
    }
}