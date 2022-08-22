//12345
//1234
//123
//12
//1
import java.util.Scanner;
public class Invertedhalfpyramidwithnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = i; i <=n; i++) {
//            for (int j = 1; j <=n-i+i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();

            for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
