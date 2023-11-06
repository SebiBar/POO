package Lab4;

public class CaracterMijloc {
    public static void main (String[] args){
        String str = "NOTA10";
        AfisCaracterMijloc(str);
    }

    public static void AfisCaracterMijloc(String str){
        int length = str.length();
        if (length%2==0)
            System.out.println(str.charAt(length/2 - 1) + "" + str.charAt(length/2));
        else
            System.out.println(str.charAt(length/2));
    }
}
