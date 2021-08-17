import java.util.Scanner;
import java.util.Arrays;
public class example1 {
    public static void main(String[] args) {

        int[] array = new int[6];
        System.out.println("enter 5 numbers");
        int i;
        for (i=0; i< array.length; i++) {
            Scanner sc = new Scanner(System.in);
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
        for ( i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

