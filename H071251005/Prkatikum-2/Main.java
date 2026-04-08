public class Main {
    public static void main(String[] args) {
        MenuGizi menu = new MenuGizi("Nasi Ayam Sayur", 500, 25.5);

        PaketMakanan paket = new PaketMakanan("Paket MBG Sehat", 20, menu);

        PelindungKesehatan pelindung = new PelindungKesehatan("Vitamin C", "Zat Besi");

        PetugasMBG petugas = new PetugasMBG("Pak Budi", 100, paket, pelindung);

        PetugasMBG siswa = new PetugasMBG("Andi", 50, paket, pelindung);

        petugas.bagikanMakanan(siswa);

        petugas.cekStatus();
        siswa.cekStatus();
    }
}
