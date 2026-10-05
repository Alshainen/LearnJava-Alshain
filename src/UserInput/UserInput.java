package UserInput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Siapa namamu: ");
        String username = input.nextLine();
        // nextLine() membaca satu baris penuh yang diketik user sampai menekan Enter,
        // lalu mengembalikannya sebagai String.

        System.out.println("Halo " + username);

        System.out.println("Btw, umurmu berapa " + username + "?");
        System.out.print(": ");
        int age = input.nextInt();
        // nextInt() untuk integer (angka bulat)

        System.out.println(age + " ya? Oke!");
        System.out.println("Namamu: " + username);
        System.out.println("Umurmu: " + age);


        // BUG WARNING!!!
        System.out.print("Your umur: ");
        int umur = input.nextInt();
        // Jika String bukan yang pertama, atau string dibawah type lain.
        // Maka kau harus menambahkan ini agar tidak bug:
        input.nextLine();
        // nextInt() tidak menghabiskan tombol Enter yang kamu ketik.
        // Akibatnya nextLine() setelahnya langsung membaca sisa Enter itu dan hasilnya string kosong

        System.out.print("Your fav animal: ");
        String favanimal = input.nextLine();

        System.out.println("Umur " + umur + " tahun, dan suka hewan " + favanimal);

        input.close();
        // Kalau tidak ditutup, file bisa tetap terbuka dan memori terbuang (resource leak)
    }
}
