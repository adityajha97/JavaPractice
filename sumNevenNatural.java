import java.util.Scanner;
public class sumNevenNatural {
    public static void main(String[] args) {
        int i , sum = 0;
        System.out.println("enter N number");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (i = 1; i < N; i++) {
            if (i%2!=0) {
                sum = sum + i;
            }
        }
        System.out.println(""+sum);

    }
}
