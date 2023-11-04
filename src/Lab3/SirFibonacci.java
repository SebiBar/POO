package Lab031;
import java.util.Scanner;
public class SirFibonacci {
    public static void main (String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = inp.nextInt();

        int t1 = 0;
        int t2 = 1;
        int urm = 0;

        for (int i=1 ; i<=n-2; ++i)
        {
            if(i == 1) {
                System.out.print(t1 + " ");
            }
            if(i == 2) {
                System.out.print(t2 + " ");
            }
            urm = t1 + t2;
            t1 = t2;
            t2 = urm;
            System.out.print(urm + " ");
        }
    }
}
