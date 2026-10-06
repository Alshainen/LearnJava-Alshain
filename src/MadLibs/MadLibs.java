package MadLibs;
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mad Libs game = Game tebak kata.

        System.out.print("Kamu ingin variabel 1 diisi dengan apa? (makanan): ");
        String one = input.nextLine();

        System.out.print("Kamu ingin variabel 2 diisi dengan apa? (orang/benda): ");
        String two = input.nextLine();

        System.out.print("Kamu ingin variabel 3 diisi dengan apa? (orang/benda): ");
        String three = input.nextLine();

        System.out.println();
        System.out.println("Gw lagi makan " + one);
        System.out.println("Pas lagi makan " + one + ", gw ketemu " + two);
        System.out.println(two + " lagi ngobrol dengan " + three);
    }
}
