import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        String[] kata = kalimat.split(" ");
        String hasil = "";

        for (String kata1 : kata) {
            if (kata1.length() > 0) {
                String hurufAwal = kata1.substring(0, 1).toUpperCase();
                String sisa = kata1.substring(1).toLowerCase();
                hasil += hurufAwal + sisa + " ";
            }
        }

        System.out.println("Hasil: " + hasil.trim());

        input.close();
    }
}