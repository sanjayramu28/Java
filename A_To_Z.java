import java.util.Scanner;

public class A_to_Z_order
{
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        String str= ip.nextLine();
        str=str.toLowerCase();
        String s="abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(s.charAt(i)==str.charAt(j))
                {
                    System.out.print(j);
                }
            }
        }
    }
}
