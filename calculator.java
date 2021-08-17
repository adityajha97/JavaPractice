import java.util.Scanner;
public class calculator {

    public static void main(String[] args) {
        System.out.println("enter two num");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter choice:");
        char c = sc.next().charAt(0);

        switch (c) {
            case '+' :
                System.out.println("sum =" + (a+b));

            case '-' :
                System.out.println("sub =" + (a-b));
        }
    }
}
