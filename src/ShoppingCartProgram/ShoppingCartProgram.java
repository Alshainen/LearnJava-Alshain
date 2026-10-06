package ShoppingCartProgram;
import java.util.Scanner;
import java.util.Locale;
// Locale ini wajib agar kita bisa setting format desimal pada input nanti.
// Meski tugasnya bukan cuman itu aja.

public class ShoppingCartProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); // Disini letak.
        // Jika sudah ada ini, maka format pada scanner "input" akan absolute pakai format US!

        String item;
        double value;
        int amount;

        System.out.print("Barang apa yang mau kamu ambil?: ");
        item = input.nextLine();

        System.out.print("Berapa harga yang kamu tawarkan untuk barang tersebut?: ");
        value = input.nextDouble();

        System.out.print("Kamu mau beli berapa?: ");
        amount = input.nextInt();

        double total = value * amount;
        System.out.println("\nTotalnya adalah: Rp." + total + " untuk item " + item + " " + amount + " buah" + " dengan harga tawaran: " + value);

        input.close();
    }
}
