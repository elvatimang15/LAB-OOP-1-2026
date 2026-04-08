public class PetugasMBG {
    String namaPetugas;
    int stamina;
    PaketMakanan paket;
    PelindungKesehatan pelindung;

    public PetugasMBG(){


    }

    public PetugasMBG(String namaPetugas, int stamina, PaketMakanan paket, PelindungKesehatan pelindung) {
        this.namaPetugas = namaPetugas;
        this.stamina = stamina;
        this.paket = paket;
        this.pelindung = pelindung;
    }

    public void bagikanMakanan(PetugasMBG siswa) {

        int energi = paket.beriEnergi(siswa.namaPetugas);

        int bonus = pelindung.tambahEnergi(10);

        int totalEnergi = energi + bonus;

        siswa.stamina += totalEnergi;

        System.out.println(namaPetugas + " memberikan makanan kepada " + siswa.namaPetugas);
        System.out.println("Energi bertambah: " + totalEnergi);
    }

    public void cekStatus() {
        System.out.println("Nama : " + namaPetugas);
        System.out.println("Stamina : " + stamina);
        System.out.println("----------------------");
    }
}
