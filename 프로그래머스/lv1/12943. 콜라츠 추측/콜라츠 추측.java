class Solution {
    public long solution(long num) {
        int cnt = 0;

        while(num!=1){
            if(cnt==500)
                return -1;
            if(num%2==0) {
                num /= 2;
                cnt++;
                if(num==1)
                    return cnt;
            } else if (num%2==1) {
                num = num*3 +1 ;
                cnt++;
                if(num==1)
                    return cnt;
            }
        }
        return cnt;
    }
}