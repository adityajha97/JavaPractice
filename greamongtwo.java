import java.util.Scanner;
 public class greamongtwo {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter two number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a>b){
            System.out.println("Greater number is = " +a);
        }
        else{
            System.out.println("Greater number is = " +b);
        }
    }
}
