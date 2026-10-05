package Variables;

public class Variables {
    public static void main(String[] args) {
        // Variabel : Wadah untuk suatu nilai.

        //   boolean
        // Primitive = nilai sederhana yang disimpan langsung di memori (stack)
        // Reference = alamat memori (di stack) yang menunjuk ke heap

        //   Primitive  vs  Reference
        //   ---------      ---------
        //   int            string
        //   double         array
        //   char           object

        // Cara buat variabel:
        // 1. Deklarasikan
        // 2. Berikan nilainya

        // int = integer (nilai bulat)
        int angka = 100;
        System.out.println(angka);
        // Teks + variabel (cuman bisa kayak gini java, ribet jir).
        System.out.println("Jumlahnya " + angka);

        // Double (nilai desimal)
        double angkaNya = 20; // Meskipun bulat, tapi kalau udah di double, akan jadi 20.0 (desimal)
        double angkaNyaLagi = 21.94;
        System.out.println(angkaNya);
        System.out.println(angkaNyaLagi);

        // Char = Character (nampung 1 nilai aja)
        char simbool = 'A'; // Petik 1 bukan 2.
        // Ga bisa lebih dari 1 nilai/huruf/angka/simbol atau sejenisnya, hanya 1 karakter aja.
        System.out.println(simbool);

        // Boolean (true / false. Cuman 2 itu aja)
        boolean akuSigma = true;
        boolean akuSkibidi = false;
        System.out.println("Apakah aku sigma: " + akuSigma);
        System.out.println("Apakah aku skibidi: " + akuSkibidi);
        // Kepakai untuk if statement nanti.

        // String (teks apa aja masuk ke dalam string)
        String nama = "Alshain";
        System.out.println("Nama: " + nama);

        /*
            UNTUK ARRAY DAN OBJECT ITU BEDA LESSON!
            MASIH TERLALU CEPAT UNTUK SEKARANG.

            (sebenarnya jga itu 2 ga ngaruh sih diajarin dsini, cmn ya penjelasannya bakalan....
             ya tau lh ya).
         */
    }
}