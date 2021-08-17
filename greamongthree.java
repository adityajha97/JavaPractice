import java.util.Scanner;

public class greamongthree {
        public static void main(String[] args) {
            int a,b,c;
            System.out.println("enter two number");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a>b && a>c){
                System.out.println("greatest no is = "+a);
            }
            else if (b>a && b>c) {
                System.out.println("greatest no is = " + b);
            }
            else{
                System.out.println("greatest no is = "+c);
            }
            }
           }
