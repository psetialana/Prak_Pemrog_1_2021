public class CobaOperator {
    public static void main(String[] args) {
        int x = 10;
        double y = 6;
        double hasil = x / y;
        System.out.println("Hasil = " + hasil);
        x = x + 1;
        System.out.println("Nilai x = " + x);
        ++x;
        System.out.println("Nilai x = " + x);
        x++;
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai x = " + ++x);
        System.out.println("Nilai x = " + x++);
        System.out.println("Nilai x = " + x);
        x = x + 5;
        System.out.println("Nilai x = " + x);
        x += 5;
        System.out.println("Nilai x = " + x);
    }
}
