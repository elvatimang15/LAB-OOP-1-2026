import java.util.Scanner;

public class SOAL1 {
    void soal1() {
        Scanner eriz1 = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ THE FIRST PROGRAM IS FIX SENTENCE    ║");
        System.out.println("║ Masukkan Kalimat :                   ║");
        System.out.println("╚══════════════════════════════════════╝");
        String[] kalimat = eriz1.nextLine().toLowerCase().split(" ");
        String hasil = "";
        for (String kata : kalimat) {
            if (kata.length() > 0) {
                hasil += Character.toUpperCase(kata.charAt(0)) + kata.substring(1) + " ";
            }
        }
        System.out.println(hasil);
    }
}