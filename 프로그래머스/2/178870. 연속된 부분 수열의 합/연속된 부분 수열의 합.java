class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        answer[1] = 1000000; 
        
        int i = 0;
        int j = 1;
        int sum = sequence[0];
        
        while (i < j) {
            if (sum == k) {
                answer = compare(answer, i, j - 1);
                
                sum -= sequence[i++];
            } else if (sum > k) {
                sum -= sequence[i++];
            }
            // sum < k
            else if(j < sequence.length) {
                sum += sequence[j++];
            } else {
                break;
            }
        }
       
        return answer;
    }
    
    public int[] compare(int[] arr, int left, int right) {
        if(right - left < arr[1] - arr[0])
            return new int[] { left, right };
        return arr;
    }
}