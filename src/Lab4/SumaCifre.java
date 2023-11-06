package Lab4;

public class SumaCifre {
    public static void main (String[] args){
        int nr = 777;
        AfisSumaCifre(nr);
    }

    public static void AfisSumaCifre(int nr){
        int sum = 0;
        while (nr>0){
            sum += nr%10;
            nr /= 10;
        }
        System.out.println(sum);
    }
}
