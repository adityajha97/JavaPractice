import java.util.Scanner;
public class Checkprime {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i;
        for (i=2;i<N;i++) {
            if (N % i == 0) {
                break;
            }
        }
            if (N==i){
                System.out.println("number is prime");
            }
            else
                System.out.println("number is not prime");
        }
    }
