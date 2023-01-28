class Solution {
    public int solution(int[][] sizes) {

        int Maxleft = 0;
        int MaxRight = 0;
        for(int i=0; i<sizes.length;i++){

            if(sizes[i][0]<sizes[i][1]){

                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }

            if(Maxleft < sizes[i][0])
                Maxleft = sizes[i][0];
            if(MaxRight < sizes[i][1])
                MaxRight = sizes[i][1];

        }

        return Maxleft * MaxRight;
    }
}