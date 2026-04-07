import java.util.Scanner;

public class SOAL4 {
    void soal4() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ THE FOURTH PROGRAM IS FACTORIAL      ║");
        System.out.println("║ Masukkan Bilangan :                  ║");
        System.out.println("╚══════════════════════════════════════╝");
        Scanner eriz4 = new Scanner(System.in);
        int bil = eriz4.nextInt();
        boolean valid = true;
        if (bil < 0){
            System.out.println("Faktorial Tidak Terdapat Pada Bilangan Negatif❌");
            valid = false;
        } else if (bil == 0) {
            System.out.println("Faktorial Dari 0 Adalah 1");
            valid = false;
        }

        if (valid) {
            int hasil = FungsiRekursif(bil);
            System.out.println("Faktorial Dari "+bil+" Adalah "+hasil);
        }


    }
    public static int FungsiRekursif(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * FungsiRekursif(n - 1);
        }
    }
}