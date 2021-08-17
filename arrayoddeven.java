import java.util.Arrays;
import java.util.Scanner;
public class arrayoddeven
{
    public static void main(String[] args)
    {
        int a[] = new int[10];
        int i;
        System.out.println("enter 10 numbers");
        for (i = 0; i < a.length; i++)
        {
            Scanner s = new Scanner(System.in);
            a[i] = s.nextInt();
        }
                    Arrays.sort(a);
             System.out.println("odd number");
             for (i = 0; i < a.length; i++)
             {
                 if (a[i] % 2 != 0)
                 {
                     System.out.println(a[i]);
                 }
             }
             System.out.println("even number");
             for (i = 0; i < a.length; i++)
             {
                 if (a[i]%2==0) {
                     System.out.println(a[i]);
                 }
        }
    }
}
