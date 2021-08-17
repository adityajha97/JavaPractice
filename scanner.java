import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter name");
        String name = s.next();
        System.out.println("enter age");
        int age = s.nextInt();
        System.out.println("enter gender");
        char gender = s.next().charAt(0);
        System.out.println("enter phone");
        long phone = s.nextLong();
        System.out.println("***********************");
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("gender :"+gender);
        System.out.println("phone :"+phone);
        System.out.println("bye");
    }
}
