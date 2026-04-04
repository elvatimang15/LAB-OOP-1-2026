import java.util.Scanner;

public class no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tanggal: ");
        String tanggal = input.nextLine();


        String[] a =tanggal.split("-");
        if (a.length == 3){
            int hari = Integer.parseInt(a[0]);
            int bulan = Integer.parseInt(a[1]);
            int tahun = Integer.parseInt(a[2]);

            String[] namaBulan = {
                "","Januari","Februari","Maret","April","Mei","Juni",
                "Juli","Agustus","September","Oktober","November","Desember"
            };

            //Asumsi: jika tahun >= 50 maka 19xx, jika <50 maka 20xx
            int cek = (tahun <=26 )? 2000 + tahun : 1900 + tahun;
            System.out.print("Output: ");
            System.out.println(hari + " "+ namaBulan[bulan]+" "+ cek);

        } else{
            System.out.println("Format input tidak valid. Pastikan format dd-mm-yy");
        }

        input.close();

    }
}