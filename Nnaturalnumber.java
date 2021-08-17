import java.util.Scanner;
public class Nnaturalnumber {
    public static void main(String[] args) {
         int i;
        System.out.println("enter N number");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (i = 1; i < N; i++) {
                System.out.println(""+i);

        }
    }
}