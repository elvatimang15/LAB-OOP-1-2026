
import java.util.Scanner;

public class no1 {

    public static String KapitalConvert(String kalimat) {
        String[] kata = kalimat.split(" ");
        String hasil = "";

        for (int i = 0; i < kata.length; i++) { // for (inisialisasi; kondisi; perubahan)
            String hurufKapital = kata[i].substring(0, 1).toUpperCase();
            String sisa = kata[i].substring(1).toLowerCase();
            hasil = hasil + hurufKapital + sisa + " ";

        }
        return hasil.trim();

    }

    public static void main(String[] args) { // MAIN METHOD
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film: ");
        String kalimat = input.nextLine();

        String hasil = KapitalConvert(kalimat);
        System.out.println("hasil: " + hasil);

        input.close();

    }

}