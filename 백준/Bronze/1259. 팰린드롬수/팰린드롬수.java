import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            String str = sc.nextLine();

            if (str.charAt(0) == '0') break;

            int correct = 0;
            for (int i = 0; i < str.length()/2; i++) {
                if(str.charAt(i)==str.charAt(str.length()-1-i))
                    correct++;
            }
            if(correct == str.length()/2)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}