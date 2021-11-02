import java.util.Scanner;
public class Siakad {
    private String[] nama = new String[1000];
    private double[] ipk = new double[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu!=5) {
            menu = tampilanMenu();
            if (menu==1) {
                siakad.lihatData();
            } else if (menu==2) {
                siakad.tambahData();
            } else if (menu==3) {
                siakad.rerataIPK();
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("..Menu..");
        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Rerata IPK");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu = ");
        int menu = scan.nextInt();
        return menu;
        
    }

    private void lihatData() {
        if (jumlahData==0) {
            System.out.println("Belum ada data");
        } else {
            System.out.println("Berikut data mahasiswa");
            for (int i=0; i<jumlahData;i++) {
                System.out.println(nama[i]+"    "+ipk[i]);
            }
        }
        
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nama mahasiswa = ");
        nama[jumlahData] = scan.nextLine();
        System.out.print("Masukan IPK mahasiswa = ");
        ipk[jumlahData] = scan.nextDouble();
        jumlahData++;
        lihatData();
    }

    public void rerataIPK() {
        double total = 0.0;
        for(int i=0; i<jumlahData; i++) {
            total += ipk[i];
        }
        double rerata = total/jumlahData;
        System.out.println("Rerata IPK Mahasiswa = "+ rerata);
    }
    
}
