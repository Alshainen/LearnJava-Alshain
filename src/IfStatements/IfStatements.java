package IfStatements;

import java.nio.file.FileAlreadyExistsException;

public class IfStatements {
    public static void main(String[] args) {
        // Singkat aja.
        // If statemenst = Kalau sesuai maka lakukan ini, kalau tidak sesuai maka lakukan yang lain.

        int age = 18;
        if (age < 5){
            System.out.println("Makhluk apa kau ini?");
        } else if (age < 18) {
            // Pastikan kalau ada yang lebih kecil nilainya, maka itu jadi if (bukan else if)
            System.out.println("Lu ga bisa masuk ke web ini!");
        } else {
            System.out.println("Oke lu boleh masuk ke web ini....");
        }

        String name = "Aldi";
        if (name == "Aldi"){
            System.out.println("Halo " + name);
        } else if (name == "Ald") {
            System.out.println("Mirip, tapi namalu kurang satu huruf");
        } else if (name.isEmpty()) {
            System.out.println("Si tanpa nama!? Jang ngawur, lu siapa!?");
        } else {
            System.out.println("Lu siape!?");
        }

        boolean college = false;
        if (college && age < 5){
            System.out.println("Makhluk apa kau ini?");
        } else if (!college && age > 18) {
            System.out.println("Kok ga lanjut kuliah mas?");
        } else if (!college && age < 18) {
            System.out.println("Nanti mau lanjut kuliah ga mas?");
        } else if (college) {
            System.out.println("Halo mas-mas IT!");
        }
        else {
            System.out.println("Lanjut kuliah mas?");
        }
    }
}
