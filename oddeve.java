import java.util.Scanner;
public class oddeve {
    public static void main(String[] arg) {
        int a;
        System.out.println("enter a number");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if (a % 2 == 0) {
            System.out.println("number is even");
        }
        else{
        System.out.println("number is odd");
        }
    }
}