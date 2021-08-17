import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        int year;
        System.out.println("enter a year");
        Scanner s = new Scanner(System.in);
        year = s.nextInt();
        if (year%4==0 && year%100!=0){
            System.out.println("this is leap year");
        }
        else{
            System.out.println("not leap year");
        }

    }

}
