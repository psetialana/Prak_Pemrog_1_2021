import java.util.Scanner;
public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
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
                siakad.cariData();
            } else if (menu==4) {
                siakad.rerataIPK();
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("..Menu..");
        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Rerata IPK");
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
                mahasiswa[i].getDetail();
            }
        }
        
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa = ");
        String nim = scan.nextLine();
        System.out.print("Masukan nama mahasiswa = ");
        String nama = scan.nextLine();
        System.out.print("Masukan IPK mahasiswa = ");
        double ipk = scan.nextDouble();
        System.out.print("Masukan Tinggi Badan mahasiswa = ");
        double tinggi = scan.nextDouble();
        Mahasiswa inputMahasiswa = new Mahasiswa(nim, nama, ipk);
        inputMahasiswa.setTinggiBadang(tinggi);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
        lihatData();
    }

    public void cariData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan dicari = ");
        String nim = scan.nextLine();
    }

    public void rerataIPK() {
        double total = 0.0;
        for(int i=0; i<jumlahData; i++) {
            total += mahasiswa[i].getIPK();
        }
        double rerata = total/jumlahData;
        System.out.println("Rerata IPK Mahasiswa = "+ rerata);
    }
    
}
