class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        String str = x+"";
        int result = 0;

        for(int i=0; i<str.length();i++){
            result += str.charAt(i) - '0';
        }

        if(x%result==0)
            return answer;
        else
            return !answer;
    }
}