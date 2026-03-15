import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        boolean panjangMinimal = password.length() >= 8;
        boolean adaHurufBesar = false;
        boolean adaHurufKecil = false;
        boolean adaAngka = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                adaHurufBesar = true;
            } else if (Character.isLowerCase(ch)) {
                adaHurufKecil = true;
            } else if (Character.isDigit(ch)) {
                adaAngka = true;
            }
        }

        if (panjangMinimal && adaHurufBesar && adaHurufKecil && adaAngka) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }
    }
}
