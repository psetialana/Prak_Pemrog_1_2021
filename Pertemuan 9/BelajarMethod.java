class BelajarMethod {
    public static void main(String[] args) {
        cobacoba();
        menampilkanTeks();
        teksDenganParameter("Pradana");
        String teks = tambahKata("Kalimat awal");
        System.out.println(teks);
        String teksDuaparameter = tambahKataDuaParameter("Kalimat awal", "kalimat kedua");
    }

    public static void menampilkanTeks() {
        System.out.println("Halo");
        System.out.println("Selamat pagi");
        System.out.println("saya sedang");
        System.out.println("mencoba");
    }

    public static void cobacoba() {
        System.out.println("Menampilkan teks yang lain");
    }

    public static void teksDenganParameter(String nama) {
        System.out.println("Nama anda adalah " + nama);
    }

    public static String tambahKata(String kataAwal) {
        String kalimat = "ini adalah kalimat tambahan " + kataAwal;
        return kalimat;
    }

    public static String tambahKataDuaParameter(String katapertama, String katakedua) {
        String kalimat = "ini adalah kalimat tambahan " + katapertama + katakedua;
        return kalimat;
    }
}