import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int subject_num = sc.nextInt();
            int result = 0;
            int[] score = new int[subject_num];

            for (int j = 0; j < subject_num; j++) {
                score[j] = sc.nextInt();
                result += score[j];
            }

            int avg = result/subject_num;
            int overStudent = 0;

            for (int j = 0; j < subject_num; j++) {
                if(score[j] > avg)
                    overStudent++;
            }
            System.out.println(String.format("%.3f", ((float)overStudent/subject_num)*100) + "%");
        }
    }
}