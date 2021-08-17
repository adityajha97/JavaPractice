import java.util.Scanner;
public class swap2num1 {
    public static void main(String[] args) {
        System.out.println("enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping a = " +a);
        System.out.println("after swapping b = " +b);
    }
}
