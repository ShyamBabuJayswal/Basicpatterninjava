//1    row no=1 , 1To1
//12    row no=2 , 1To2
//123    row no=3 , 1To3
//12345    row no=4 , 1To4
//12345    row no=5 , 1To5
import java.util.Scanner;
public class Halfpyramidwithnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

}}
