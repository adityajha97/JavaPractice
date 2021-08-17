import java.util.Scanner;

public class swap2num2 {
        public static void main(String[] args) {
            System.out.println("enter two numbers");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            a = a+b;
            b = a-b;
            a = a-b;
            System.out.println("after swapping a = " +a);
            System.out.println("after swapping b = " +b);
        }
    }


