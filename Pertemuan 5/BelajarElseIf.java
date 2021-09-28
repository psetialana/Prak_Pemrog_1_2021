import java.util.Scanner;

public class BelajarElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan umur Anda = ");
        int umur = scanner.nextInt();
        if (umur <= 5 && umur >= 0) {
            System.out.println("Anda masih balita");
        } else if (umur > 5 && umur <= 19) {
            System.out.println("Anda sudah remaja");
        } else if (umur > 19) {
            System.out.println("Anda sudah dewasa");
        } else {
            System.out.println("Umur Anda tidak valid");
        }
    }
}
