import java.util.Scanner;

public class Nomor2 {

    public static String konversiTanggal(String tanggal) {
        String[] namaBulan = { "Januari", "Februari", "Maret", "April", "Mei", "Juni",
        "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        String[] bagian = tanggal.split("-");

        int hari = Integer.parseInt(bagian[0]);
        int bulan = Integer.parseInt(bagian[1]);
        int tahun = Integer.parseInt(bagian[2]);

        int[] jumlahHari = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (hari < 1 || hari > jumlahHari[bulan - 1]) {
            return "Tanggal tidak valid!";
        } if (bulan < 1 || bulan > 12) {
            return "Bulan tidak valid!";
        }

        if (tahun <= 26) {
            tahun += 2000;
        } else {
            tahun += 1900;
        }

        return hari + " " + namaBulan[bulan - 1] + " " + tahun;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String tanggal = input.nextLine();

        System.out.println("Hasil konversi: " + konversiTanggal(tanggal));
        input.close();
    }
}