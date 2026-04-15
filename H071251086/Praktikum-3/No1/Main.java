import javax.sound.sampled.SourceDataLine;

public class Main {
    
    public static void main(String[] args) {
        DompetDigital dompet = new DompetDigital("777777", "USR-777");
        System.out.println();


        System.out.println("---INFO AKUN---");
        System.out.println("ID Nasabah : " + dompet.getidNasabah());
        System.out.println("Status Akun : " + dompet.getstatusAkun());
        System.out.println("Saldo : " + dompet.getsaldo());
        System.out.println();

        //pin salah
        System.out.println("---UBAH PIN---");
        dompet.setPIN("777RRR", "977777");
        System.out.println();
        
        //pin benar
        System.out.println("---UBAH PIN---");
        dompet.setPIN("777777", "977777");
        System.out.println();
        
        //setor tunai valid
        System.out.println("---SETOR TUNAI---");
        dompet.setorTunai(1000000.0);
        System.out.println();

        //setor tunai ditolak
        System.out.println("---SETOR TUNAI---");
        dompet.setorTunai(-9000000);
        System.out.println();


        //tarik tunai pass salah
        System.out.println("---TARIK TUNAI---");
        dompet.tarikTunai(700000, "777777");
        System.out.println();

        //tarik tunai pass benar
        System.out.println("---TARIK TUNAI---");
        dompet.tarikTunai(700000, "977777");
        System.out.println();

        System.out.println("Saldo Akhir : " + dompet.getsaldo());
    }


}
