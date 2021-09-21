import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai a = ");
        double a = scanner.nextDouble();
        System.out.print("Masukan nilai b = ");
        double b = scanner.nextDouble();
        double hasil = a + b;
        System.out.println("Hasil a + b = " + hasil);
        hasil = a - b;
        System.out.println("Hasil a - b = " + hasil);
    }
}
