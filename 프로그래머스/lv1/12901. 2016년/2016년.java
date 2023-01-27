class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String day[] = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int array[] = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int a_data = 0;
        for(int i=0; i<a-1; i++){
            a_data+=array[i];
        }

        a_data += (b-1);
        answer = day[a_data % 7];
        return answer;
    }
}