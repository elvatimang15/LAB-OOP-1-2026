class Santri {
    String nama;
    int hafalan;
    Kitab kitab;

    Santri() {
        nama = "Tanpa Nama";
        hafalan = 0;
        kitab = new Kitab("Tidak Ada", 0);
    }

    Santri(String nama, int hafalan, Kitab kitab) {
        this.nama = nama;
        this.hafalan = hafalan;
        this.kitab = kitab;
    }

    public void tambahHafalan(int jumlah) {
        hafalan += jumlah;
        System.out.println(nama + " menambah hafalan sebanyak " + jumlah);
    }

    public void murojaah(Santri teman) {
        System.out.println(nama + " melakukan murojaah bersama " + teman.nama);
        
        teman.hafalan += 1;
        
        System.out.println(teman.nama + " mendapatkan tambahan hafalan 1");
    }

    public void tampilkanInfo() {
        System.out.println("Nama Santri : " + nama);
        System.out.println("Hafalan     : " + hafalan);
        System.out.println("Kitab       : " + kitab.namaKitab);
        System.out.println("--------------------------");
    }
}