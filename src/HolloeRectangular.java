//*****
//*   *
//*   *
//*****
import java.util.Scanner;
public class HolloeRectangular {
    //print star when i=1 or j=1 or i=n(number of rows) or i=m(number of coloum)
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for (int i = 1; i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 ||  i==n || j==m){
                    System.out.print("*");

                }else{
                System.out.print(" ");
            }}
            System.out.println();


    }
}}