import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int original = 1000;
        int remain = 0;
        int[] count = new int[6];
        int in = original - input;
        
        while(in>0){
            if(in>=500){
                count[0]=in/500;
                in=in%500;
            } else if(in>=100) {
                count[1]=in/100;
                in=in%100;
            } else if(in>=50) {
                count[2]=in/50;
                in=in%50;
            } else if(in>=10) {
                count[3]=in/10;
                in=in%10;
            } else if(in>=5) {
                count[4]=in/5;
                in=in%5;
            } else if(in>=1) {
                count[5]=in/1;
                in=in%1;
            }
        }
        for(int i=0; i<count.length;i++)
            remain+=count[i];
        System.out.println(remain);
    }
}