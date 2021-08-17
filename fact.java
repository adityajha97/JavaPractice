import java.util.Scanner;
public class fact{
    public static void main(String[] args) {
        int fact=1,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        {
             for (i=n;i>0;i--)
              fact=fact*i;
        }
        System.out.println("factorial is " +fact);
    }
}
