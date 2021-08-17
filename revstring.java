import java.util.Scanner;
public class revstring {
    public static void main(String[] args) {
        String rev = "";
        String name = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        name = sc.nextLine();
       int length = name.length();
        for (int i = length-1; i>=0; i--)
        {
            rev = rev + name.charAt(i);
        }
        System.out.println("reverse name: " +rev);
    }
}
