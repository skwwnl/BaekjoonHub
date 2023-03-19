import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] totalNum = new int[num];

        for (int i = 0; i < num; i++) {
            int input = sc.nextInt();
            totalNum[i] = input;
        }

        int findNum = sc.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            if(totalNum[i]==findNum)
                count++;
        }
        System.out.println(count);
    }
}
