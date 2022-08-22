//    *     4space+1 star
//   **     3space+2 star
//  ***     2space+3 star
// ****     1space+4 star
//*****     0space+5star
import java.util.Scanner;
public class Inverthalfpyramidroatateby180 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

}}
