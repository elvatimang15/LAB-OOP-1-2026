class DompetDigital {
    private String pin;
    private double saldo;
    protected String idNasabah; 
    String statusAkun;

    public DompetDigital (String pin, String idNasabah) {
        this.pin = pin;
        this.idNasabah = idNasabah;
        this.saldo = 0;
        this.statusAkun = "AKTIF";

        System.out.println("Akun berhasil dibuat untuk ID : " + this.idNasabah);
        System.out.println("Saldo awal : " + this.saldo);

    }

    public String getidNasabah(){
        return idNasabah;
    }
    public double getsaldo(){
        return saldo;
    }
    // public boolean checkPIN(String input){
    //     return this.pin.equals(input);
    // }
    public String getstatusAkun(){
        return statusAkun;
    }

    private void catatRiwayat(String pesan){
        System.out.println("[LOG SISTEM]" + pesan);
    }

    public void setPIN(String pinLama, String pinBaru){
        if (pinLama.equals(this.pin)){
            if (pinBaru.length() == 6){
                this.pin = pinBaru;
                catatRiwayat("PIN berhasil diperbarui");
            }else {
                catatRiwayat("Gagal : PIN baru harus terdiri dari 6 karakter!");
            }
        }else{
            catatRiwayat("Gagal : PIN tidak sesuai!");
        }
    }

    public void setorTunai(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            catatRiwayat("Berhasil setor tunai : " + jumlah);
        }else {
            catatRiwayat("Gagal setor tunai : Nominal tidak valid!");
        }
    }

    public void tarikTunai(double jumlah, String inputPIN){
        if (inputPIN.equals(this.pin)){
            if (this.saldo >= jumlah){
                this.saldo -= jumlah;
                catatRiwayat("Transaksi berhasil! Saldo saat ini : " + this.saldo);
            }else{
                catatRiwayat("Gagal : saldo anda kureng!");
            }
        }else {
            catatRiwayat("Gagal : PIN tidak valid!");
        }
    }
}
