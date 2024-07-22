import java.util.*;
public class ipclass{
public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
    String ip=sc.next();
    String[] arr=ip.split("[.]",0);
    // System.out.println(arr[1]);
    int i=0,flag=0;
    int clas =Integer.parseInt(arr[0]);
    if(arr.length==4) {
        while (i < arr.length) {
            if (arr[i].length() <= 3) {               
                int ipv = Integer.parseInt(arr[i]);
                if(i==0&&ipv<=247){
                    flag=1;
                }
                else if (i>0&&ipv <= 255) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
            else{
                flag=0;
                break;
            }
            i++;
        }
    }
    else
        flag=0;
    if(flag==1){
        if(clas>=0&&clas<=127)
            System.out.println("Class A");
        else if(clas>127&&clas<=191)
            System.out.println("Class B");
        else if(clas>191&&clas<=223)
            System.out.println("Class C");
        else if(clas>223&&clas<=239)
            System.out.println("Class D");
    }
    System.out.println((flag==1)?"Valid":"Not valid");
}
}
