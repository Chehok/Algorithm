class Solution {
    public int solution(int[] common) {
        int idx = common.length - 1;
        
        if(common[1] - common[0] == common[2] - common[1]) { // 등차
            return common[idx] + (common[idx - 1] - common[idx - 2]);
        } else { // 등비
            return common[idx] * (common[idx - 1] / common[idx - 2]);
        }
    }
}