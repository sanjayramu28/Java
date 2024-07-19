import java.util.Scanner;

public class Characterc
{
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        String st=ip.nextLine();
        String r="";
        char c;
        for (int i = 0; i < st.length(); i++) {
            c = st.charAt(i);
            if (Character.isUpperCase(c))
                r+=Character.toLowerCase(c);
            else
                r+=Character.toUpperCase(c);
        }
        System.out.print(r);
    }
}
