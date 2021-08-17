import java.util.Scanner;

public class Noddnatural {
    public static void main(String[] args) {
        int i;
        System.out.println("enter N number");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (i = 1; i < N; i++) {
            if (i%2!=0){
                System.out.println(""+i);
            }

        }
    }
}