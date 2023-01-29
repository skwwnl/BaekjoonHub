class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[win_nums.length-4];

        int zero_cnt = 0;
        int correct_cnt = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0)
                zero_cnt++;
        }

        for(int i=0; i<lottos.length;i++){
            for(int j=0;j<lottos.length;j++){
                if(lottos[i]==win_nums[j])
                    correct_cnt++;
            }
        }

        if(zero_cnt==0&&correct_cnt==0){
            answer[0] = 6;
            answer[1] = 6;
            return answer;
        } else if (zero_cnt==6&&correct_cnt==0) {
            answer[0] = 1;
            answer[1] = 6;
            return answer;
        }
        answer[0] = 7-(zero_cnt+correct_cnt);
        answer[1] = 7-(correct_cnt);
        
        return answer;
    }
}