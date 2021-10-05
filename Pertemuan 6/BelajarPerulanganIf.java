import java.util.Scanner;

public class BelajarPerulanganIf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan bilangan genap maksimal yang akan ditampilkan = ");
        int n = scan.nextInt();
        int i = 1;
        while (i != n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    
}
