import java.util.Scanner;

public class SOAL5 {
    void soal5() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ THE FIFTH PROGRAM IS FIND THE NUMBER ║");
        System.out.println("║ Mencari Bilangan Berapa? :           ║");
        System.out.println("╚══════════════════════════════════════╝");
        Scanner eriz5 = new Scanner(System.in);

        int[][] matriks = {
                {2, 2, 3},
                {4, 2, 6},
                {7, 8, 9}
        };
        int cari = eriz5.nextInt();
        boolean nilai = false;

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (matriks[i][j] == cari) {
                    System.out.println("Found "+cari+" at ["+i+"]["+j+"]");
                    nilai = true;
                }
            }
        }
        if (!nilai) {
            System.out.println("Not Found❌");
        }
    }
}