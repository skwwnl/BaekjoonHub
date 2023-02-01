class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;
        int[] nums = new int[right - left + 1];
        
        for(int i=0; i<nums.length;i++){
            nums[i] = left + i;

            for(int j=1; j*j <=nums[i];j++){
                if(j*j==nums[i]) cnt++;
                else if (nums[i]%j==0) cnt+=2;
            }
            if(cnt%2==0)
                answer+=nums[i];
            else
                answer-=nums[i];
            cnt=0;
        }
        return answer;
    }
}