import java.util.Scanner;
public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        

        System.out.print("Masukkan password: ");
         String password = input.nextLine();

         boolean isValid = false;

         //a. ketentuan minimal 8 karakter
         if (password.length()>=8){
            boolean adaHurufkapital = false;
            boolean adHurufkecil = false;
            boolean punyaAngka = false;

            // b. loop setiap karakter untuk memeriksa ketentuan
            for (int i = 0; i < password.length(); i++){
                char c = password.charAt(i);

                if (Character.isUpperCase(c)){
                    adaHurufkapital = true;
                } else if (Character.isLowerCase(c)){
                    adHurufkecil = true;
                } else if (Character.isDigit(c)){
                    punyaAngka = true;
                }
            }

            // Logika: jika semua ketentuan terpenuhi, maka password valid
            if (adaHurufkapital&&adHurufkecil&&punyaAngka){
                isValid = true;
            }
         }

        // menampilkan hasil validasi
        if (isValid){
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }

        input.close();
    }
}
