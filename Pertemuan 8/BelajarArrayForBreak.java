import java.util.Scanner;

public class BelajarArrayForBreak {
    public static void main(String[] args) {
        int[] bilangan = new int[1000];
        for (int i = 0; i<1000; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukan bilangan ke-"+i+" = ");
            int cek = scan.nextInt();
            if (cek==0) {
                break;
            } else {
                bilangan[i] = cek;
            }
        }
        for (int i=0; i<bilangan.length; i++) {
            if (bilangan[i]==0) {
                break;
            } else {
                System.out.println("Bilangan ke-"+i+" = "+bilangan[i]);
            }
        }
    }
}
