package TugasPraktikum3;
public class Main{

    public static void main(String[] args) {
        DompetDigital dompet1 = new DompetDigital("Eriz Affanditya Nursin ", 123456, "H071251024");
        dompet1.InformasiPengguna();
        dompet1.SetPin(654321);
        dompet1.SetPin(123457);
        dompet1.SetorTunai(100000);
        dompet1.SetorTunai(-100000);
        dompet1.TarikTunai(200000);
        dompet1.TarikTunai(50000);
        dompet1.TampilkanSaldo();
    }
}

