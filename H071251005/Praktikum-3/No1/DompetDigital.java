class DompetDigital{
    private String pin;
    private double saldo;
    protected String idNasabah;
    String statusAkun;

    public DompetDigital(String idNasabah, String pin){
        this.idNasabah = idNasabah;
        this.pin = pin;
        this.saldo = 0; 
        this.statusAkun = "AKTIF";
    }
    public String getIdNasabah(){
        return idNasabah;
    }
    public double getSaldo() {
        return saldo;
    }
    public void ubahPin(String pinLama, String pinBaru) {
        if (!this.pin.equals(pinLama)) {
            System.out.println("Pin lama salah!");
            logTransaksi("Gagal ubah PIN");
        } else if (pinBaru.length() != 6) {
            System.out.println("PIN baru harus 6 digit!");
            logTransaksi("Gagal ubah PIN");
        } else {
            this.pin = pinBaru;
            System.out.println("PIN berhasil diubah!");
            logTransaksi("Berhasil ubah PIN");
        }
    }
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Nominal tidak valid!");
            logTransaksi("Gagal setor");
        } else {
            saldo += jumlah;
            System.out.println("Setor berhasil: " + jumlah);
            logTransaksi("Berhasil setor");
        }
    }
    public void tarik(double jumlah, String inputPin) {
        if (!this.pin.equals(inputPin)) {
            System.out.println("PIN salah!");
            logTransaksi("Gagal tarik (PIN salah)");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup!");
            logTransaksi("Gagal tarik (saldo kurang)");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil: " + jumlah);
            logTransaksi("Berhasil tarik");
        }
    }
    private void logTransaksi(String pesan) {
        System.out.println("catatan: " + pesan);
    }
}
