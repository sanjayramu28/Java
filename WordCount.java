import java.util.Scanner;
public class WordCount {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String arr[]=str.split(" ");
        System.out.println(arr.length);
    }
}
