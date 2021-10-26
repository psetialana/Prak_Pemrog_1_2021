import java.util.Scanner;
public class TugasKalkulator {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai A = ");
        int nilaiA = scan.nextInt();
        System.out.print("Masukan nilai B = ");
        int nilaiB = scan.nextInt();

        int hasil = penjumlahan(nilaiA, nilaiB);
        System.out.println("Nilai A + B = " + hasil);
    }

    public static int penjumlahan(int a, int b) {
        int hasil = a + b;
        return hasil;
    }
}
