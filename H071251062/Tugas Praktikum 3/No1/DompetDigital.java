class DompetDigital {

    private double saldo;
    private String pin;
    protected String idNasabah;
    String statusAkun;

    public DompetDigital(String idNasabah, String pin) {
        this.idNasabah = idNasabah;
        this.pin = pin;
        this.saldo = 0; // saldo otomatis 0
        this.statusAkun = "Aktif";
    }

    public String getIdNasabah() {
        return idNasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    private void logTransaksi(String pesan) {
        System.out.println("[LOG]: " + pesan);
    }

    public void setPin(String pinLama, String pinBaru) {
        if (!this.pin.equals(pinLama)) {
            System.out.println("PIN lama salah! Perubahan ditolak.");
        } else if (pinBaru.length() != 6) {
            System.out.println("PIN baru harus 6 digit!");
        } else {
            this.pin = pinBaru;
            System.out.println("PIN berhasil diubah.");
        }
        System.out.println(" ");
    }

    public void setor(double jumlah, String pinInput) {
        if (!this.pin.equals(pinInput)) {
            System.out.println("PIN salah!");
            logTransaksi("Setor gagal (PIN salah)");
        } else if (jumlah <= 0) {
            System.out.println("Saldo tidak terdefinisi!");
            logTransaksi("Setor gagal (saldo kurang)");
        } else {
            saldo += jumlah;
            System.out.println("Setor berhasil.");
            logTransaksi("Setor berhasil");
        }
        System.out.println(" ");
    }

    public void tarik(double jumlah, String pinInput) {
        if (!this.pin.equals(pinInput)) {
            System.out.println("PIN salah!");
            logTransaksi("Tarik gagal (PIN salah)");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup!");
            logTransaksi("Tarik gagal (saldo kurang)");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil.");
            logTransaksi("Tarik berhasil");
        }
        System.out.println(" ");
    }
}
