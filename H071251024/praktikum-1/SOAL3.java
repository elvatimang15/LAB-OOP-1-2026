import java.util.Scanner;

public class SOAL3 {
    void soal3() {
        Scanner eriz3 = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ THE THIRD PROGRAM IS TRUE PASS       ║");
        System.out.println("║ Masukkan Sandi Anda :                ║");
        System.out.println("╚══════════════════════════════════════╝");
        String password = eriz3.nextLine();
        boolean len = false;
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;

        for (int i = 0 ; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                upper = true;
            } else if (Character.isLowerCase(c)) {
                lower = true;
            } else if (Character.isDigit(c)) {
                digit = true;
            }
        }
        if (password.length() >= 8) {
            len = true;
        }

        if (!len) {
            System.out.println("Password Minimal 8 Karakter❌");
        }if (!upper) {
            System.out.println("Password Harus Memiliki Huruf Kapital❌");
        }if (!lower) {
            System.out.println("Password Harus Memiliki Huruf Kecil❌");
        }if (!digit) {
            System.out.println("Password Harus Memiliki Angka❌");
        }

        if (len && upper && lower && digit){
            System.out.println("Password Valid✅");
        } else if (!len && !upper && !lower && !digit){
            System.out.println("Password Tidak Valid❌");
        }
    }
}