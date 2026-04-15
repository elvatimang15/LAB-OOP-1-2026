import java.util.Scanner;
public class No1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan judul film: ");
        String judul = input.nextLine();

        kapital(judul); 
    }

    static void kapital(String kalimat){

        String[] kata = kalimat.split(" ");
        String hasil = "";

        for (int i = 0; i < kata.length; i++) {

            String pertama = kata[i].substring(0,1).toUpperCase();
            String sisa = kata[i].substring(1).toLowerCase();

            hasil += pertama + sisa + " " ;
        }

        System.out.println("Hasil : " + hasil);
    }
}