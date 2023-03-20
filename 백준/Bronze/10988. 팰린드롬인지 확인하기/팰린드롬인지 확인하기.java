import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int strLength = 0;
        strLength = str.length();
        int checkNum = 0;

        for (int i = 0; i < strLength/2; i++) {
            if(str.charAt(i)==str.charAt(strLength-1-i))
                checkNum++;
        }

        if(checkNum==strLength/2)
            System.out.println(1);
        else
            System.out.println(0);
    }
}