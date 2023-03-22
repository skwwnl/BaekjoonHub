import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int total = 0;
        int hour = 0;
        int minute = 0;

        total = A * 60 + B + C;

        if(total>=1440)
            total-=1440;

        hour = total/60;
        minute = total%60;

        System.out.println(hour + " " + minute);

    }
}