import java.util.*;
class Ascii{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int val=(int) ch[i];
            if(val%2==0){
                System.out.print(ch[i]+" ");
            }
        }
    }
}
