package tantanganCode1;
import java.util.Scanner;
import java.util.Locale;

public class tantanganCode1 {
    public static void main(String[] args) {
        // Struk belanja toko!
        int shoppingDiscount100000 = 5;
        int shoppingDiscount200000 = 10;
        int memberDiscount = 2;
        boolean member = true;
        int subtotal = 0;

        String item1 = "";
        String item2 = "";

        int item1Value = 0;
        int item2Value = 0;
        int item1Price = 0;
        int item2Price = 0;

        int item1Amount = 0;
        int item2Amount = 0;

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Nama: ");
        String name = input.nextLine();

        System.out.print("Status (1 /2): ");
        int memberStatus = input.nextInt();
        input.nextLine();
        if (memberStatus == 1){
            member = true;
        }
        else {
            member = false;
        }

        System.out.print("Barang: ");
        item1 = input.nextLine();

        System.out.print("Harga yang ditawarkan: ");
        item1Price = input.nextInt();
        input.nextLine();
        item1Value += item1Price;

        System.out.print("Mau beli berapa " + item1 + "nya?: ");
        item1Amount = input.nextInt();
        input.nextLine();
        item1Value *= item1Amount;
        subtotal += item1Value;

        System.out.print("Mau beli barang yang lain? (y/n): ");
        String nextItemConfirm = input.nextLine();

        boolean item2Status = false;
        if (nextItemConfirm.equalsIgnoreCase("y") || nextItemConfirm.equalsIgnoreCase("yes")){
            item2Status = true;
            System.out.print("Barang: ");
            item2 = input.nextLine();

            System.out.print("Harga yang ditawarkan: ");
            item2Price = input.nextInt();
            input.nextLine();
            item2Value += item2Price;

            System.out.print("Mau beli berapa " + item2 + "nya?: ");
            item2Amount = input.nextInt();
            input.nextLine();
            item2Value *= item2Amount;
            subtotal += item2Value;
        }

        System.out.print("Membayar: ");
        int pay = input.nextInt();
        input.nextLine();

        int total = 0;
        if (subtotal >= 200000 && member){
            int totalDiscount = shoppingDiscount200000 + memberDiscount;
            total = subtotal - (subtotal * totalDiscount / 100);
        } else if (subtotal >= 100000 && member) {
            int totalDiscount = shoppingDiscount100000 + memberDiscount;
            total = subtotal - (subtotal * totalDiscount / 100);
        } else if (subtotal >= 200000 && !member) {
            total = subtotal - (subtotal * shoppingDiscount200000 / 100);
        } else if (subtotal >= 100000 && !member) {
            total = subtotal - (subtotal * shoppingDiscount100000 / 100);
        } else if (subtotal < 100000 && member) {
            total = subtotal - (subtotal * memberDiscount / 100);
        } else {
            total = subtotal;
        }

        System.out.println();
        System.out.println("===== TOKO BERKAH =====");
        System.out.println("Pelanggan : " + name);
        if (member){
            System.out.println("Status    : Member");
        }else {
            System.out.println("Status    : Reguler");
        }
        System.out.println("-----------------------");
        System.out.println(item1 + " " + "x" + item1Amount + " = " + "Rp" + item1Value);
        if (item2Status){
            System.out.println(item2 + " " + "x" + item2Amount + " = " + "Rp" + item2Value);
        }
        System.out.println("-----------------------");
        System.out.println("Subtotal            : " + "Rp" + subtotal);
        if (subtotal >= 200000){
            int discount10Percent = subtotal * shoppingDiscount200000 / 100;
            System.out.println("Diskon belanja 10%  : " + "Rp" + discount10Percent);
        } else if (subtotal >= 100000) {
            int discount5Percent = subtotal * shoppingDiscount100000 / 100;
            System.out.println("Diskon belanja 5%   : " + "Rp" + discount5Percent);
        } else {
            System.out.println("Diskon belanja      : " + "Rp0");
        }
        if (member){
            int discountMember = subtotal * memberDiscount / 100;
            System.out.println("Diskon member       : " + "Rp" + discountMember);
        }
        else {
            System.out.println("Diskon member       : " + "Rp0");
        }
        System.out.println("Total bayar         : " + "Rp" + total);
        System.out.println("Dibayar             : " + "Rp" + pay);
        if (pay < total){
            System.out.println("Uang kamu kurang    : " + "Rp" + (pay - total));
        }
        else {
            System.out.println("Kembalian           : " + "Rp" + (pay - total));
        }
        System.out.println("=======================");
        System.out.println("Terimakasih, " + name + "!");

        input.close();
    }
}


// Penilaian Client: 95/100