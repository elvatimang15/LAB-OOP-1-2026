import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String tanggal = a.nextLine();
        String[]bagian = tanggal.split("-");
        int hari = Integer.parseInt(bagian[0]);
        if (hari > 31 || hari < 1){
            System.out.println("Tanggal tidak valid.");
        }

        int bulan = Integer.parseInt(bagian[1]);
        if (bulan > 12 || bulan < 1){
            System.out.println("Bulan tidak valid.");
        }
        String mounth = "";
        switch (bulan) {
            case 1:
                mounth = "Januari";
                break;
            case 2:
                mounth = "Februari";
                break;
            case 3:
                mounth = "Maret";
                break;
            case 4:
                mounth = "April";
                break;
            case 5:
                mounth = "Mei";
                break;
            case 6:
                mounth = "Juni";
                break;
            case 7:
                mounth = "Juli";
                break;
            case 8:
                mounth = "Agustus";
                break;
            case 9:
                mounth = "September";
                break;
            case 10:
                mounth = "Oktober";
                break;
            case 11:
                mounth = "November";
                break;
            case 12:
                mounth = "Desember";
                break;
        }

        int tahun = Integer.parseInt(bagian[2]);
        if (tahun > 26){
            tahun += 1900;
        }else if (tahun <= 0 || tahun > 99) {
            System.out.println("Tahun tidak valid.");
        }else{
            tahun += 2000;
        }

        System.out.println(hari + " " + mounth + " " +  tahun);
        a.close();
    }
}
