import java.util.Scanner;

public class BelajarForPola2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = scan.nextInt();
        if (n % 2 == 0) {
            // lengkapi sendiri
        } else {
            for (int i = 1; i<=n ; i++) {
                for (int j=n; j>=1; j--) {
                    if (j<=i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
    
}
