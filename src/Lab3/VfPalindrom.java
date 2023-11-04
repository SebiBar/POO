package Lab031;
import java.util.Scanner;
public class VfPalindrom {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number: ");
        String str = inp.nextLine();

        if (verificaPalindrom(str))
            System.out.println("Numarul este palindrom");
        else
            System.out.println("Numarul nu este palindrom");
    }

    public static boolean verificaPalindrom(String str)
    {
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--)
            rev.append(str.charAt(i));

        return str.contentEquals(rev);
    }
}
