import java.util.Scanner;

public class SOAL2 {
    void soal2() {
        Scanner eriz2 = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ THE SECOND PROGRAM IS FIX THE DATE   ║");
        System.out.println("║ Masukkan Tanggal Lahir (dd-mm-yy) :  ║");
        System.out.println("╚══════════════════════════════════════╝");
        String[] date = eriz2.nextLine().split("-");
        int tanggal = Integer.parseInt(date[0]);
        int bulan = Integer.parseInt(date[1]);
        int tahun = Integer.parseInt(date[2]);

        String mount = "";
        int n = 31;
        switch (bulan) {
            case 1: mount = "Januari"; break;
            case 2:
                mount = "Februari";
                n = 28;
                if (tahun % 4 == 0 && tahun % 100 != 0) {
                    n = 29;
                }
                break;
            case 3: mount = "Maret"; break;
            case 4: mount = "April"; n = 30; break;
            case 5: mount = "Mei"; break;
            case 6: mount = "Juni"; n = 30; break;
            case 7: mount = "Juli"; break;
            case 8: mount = "Agustus"; break;
            case 9: mount = "September"; n = 30; break;
            case 10: mount = "Oktober"; break;
            case 11: mount = "November"; n = 30; break;
            case 12: mount = "Desember"; break;
        }
        boolean valid = true;
        if (bulan <= 0 || bulan > 12){
            valid = false;
            System.out.println("bulan tidak valid");
        }
        if (tanggal <= 0 || tanggal > n) {
            valid = false;
            System.out.println("tanggal tidak valid.");
        }
        if (tahun >= 0 && tahun <= 26) {
            tahun += 2000;
        } else if (tahun >= 27 && tahun <= 99) {
            tahun += 1900;
        } else {
            valid = false;
            System.out.println("tahun tidak valid.");
        }
        if (valid){
            System.out.println(tanggal + " " + mount + " " + tahun);
        }
    }
}