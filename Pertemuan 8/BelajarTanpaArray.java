import java.util.Scanner;

public class BelajarTanpaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan bilangan ke-1 : ");
        int bilangan1 = scanner.nextInt();
        System.out.print("Masukan bilangan ke-2 : ");
        int bilangan2 = scanner.nextInt();
        System.out.print("Masukan bilangan ke-3 : ");
        int bilangan3 = scanner.nextInt();

        int jumlah = bilangan1 + bilangan2 + bilangan3;
        System.out.println("Jumlah " + jumlah);

    }
}