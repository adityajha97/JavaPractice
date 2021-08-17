import java.util.Scanner;

public class reverseNnatu {
        public static void main(String[] args) {
            int i;
            System.out.println("enter N number");
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            System.out.println("reverse N natural number is:");
            for (i = N; i >=1; i--) {
                System.out.println(""+i);
            }
        }
    }