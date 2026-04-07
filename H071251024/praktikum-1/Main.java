import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner mainan = new Scanner(System.in);
        SOAL1 riz1 = new SOAL1();
        SOAL2 riz2 = new SOAL2();
        SOAL3 riz3 = new SOAL3();
        SOAL4 riz4 = new SOAL4();
        SOAL5 riz5 = new SOAL5();
        DEKORASI dekorasi = new DEKORASI();
        while (true) {
            try {
                dekorasi.DEKORASI();
                int input = mainan.nextInt();
                if (input == 1) {
                    riz1.soal1();
                } else if (input == 2) {
                    riz2.soal2();
                } else if (input == 3) {
                    riz3.soal3();
                } else if (input == 4) {
                    riz4.soal4();
                } else if (input == 5) {
                    riz5.soal5();
                } else if (input == 0) {
                    System.out.println("Program di Hentikan\uD83D\uDED1");
                    break;
                } else {
                    System.out.println("program ke-" + input + " tidak tersedia❌");
                }
            } catch (Exception e) {
                System.out.println("Input Tidak Valid❌");
                mainan.nextLine();

            }
        }
    }
    Main(){}
}
