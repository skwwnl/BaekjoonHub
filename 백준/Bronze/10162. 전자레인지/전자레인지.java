import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] nums = new int[3];

        while(T>0){
            if(T>=300){
                nums[0]=T/300;
                T%=300;
            } else if (T>=60) {
                nums[1]=T/60;
                T%=60;
            } else if (T>=10){
                nums[2]=T/10;
                T%=10;
            } else{
                nums = new int[]{-1};
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d ", nums[i]);
        }
    }
}