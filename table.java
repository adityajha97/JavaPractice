import java.util.Scanner;
public class table {
    public static void main(String[] arg) {
        int i;
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("table is =");
        for (i = 1; i <= 10; i++) {
            int tab = n * i;
            System.out.println(+ tab);
        }

    }
}
