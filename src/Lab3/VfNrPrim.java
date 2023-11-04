package Lab031;

public class VfNrPrim {
    public static void main (String[] args)
    {
        int[] sirNr = {1,3,2,5,7,9,10,20};
        for (int i : sirNr)
            if (nrPrim(i))
                System.out.println(i);
    }

    public static Boolean nrPrim(int nr)
    {
        for (int i=2;i<=nr/2;i++)
            if (nr%i==0)
                return false;
        return true;
    }
}
