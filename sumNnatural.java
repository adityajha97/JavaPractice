import java.util.Scanner;

public class sumNnatural {
        public static void main(String[] args) {
            int i , sum = 0;
            System.out.println("enter N number");
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            for (i = 1; i < N; i++) {
                sum = sum + i;
            }
                System.out.println(""+sum);

            }
        }

