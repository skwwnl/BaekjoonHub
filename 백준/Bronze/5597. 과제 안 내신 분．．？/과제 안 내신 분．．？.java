import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] totalNum = new int[31];
        int submitNum;

        for (int i = 0; i < 28; i++) {
            submitNum = sc.nextInt();
            totalNum[submitNum] = submitNum;
        }

        for (int i = 1; i < totalNum.length; i++) {
            if(totalNum[i]==0){
                System.out.println(i);
            }
        }
    }
}
