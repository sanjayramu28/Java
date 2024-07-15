import java.util.Scanner;
public class Third_Largest_With_Out_Default_Methods {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int k=0;k<n;k++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int count=0;
        int index=0;
        int l3=0;
        for(int i=arr.length-1;i>=1;i--){
            if(arr[i]!=arr[i-1]){
                count++;
            }
            if(count==3){
                index=i;
                l3=arr[i];
                break;
            }
        }
        System.out.print("Array = ");
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Index= "+index);
        System.out.println("3rd Largest= "+l3);
    }
}
