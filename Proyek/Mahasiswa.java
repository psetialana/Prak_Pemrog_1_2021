public class Mahasiswa extends Manusia {
    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() {
        return this.ipk;
    }

    public void getDetail() {
        System.out.printf("%10s %20s %5s %5s", "NIM", "NAMA", "IPK", "TINGGI BADAN");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %20s %5s %5s", this.nim, this.nama.toUpperCase(), String.valueOf(this.ipk), String.valueOf(this.tinggiBadan));
        System.out.println();
    }

}
