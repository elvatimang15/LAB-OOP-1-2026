public class PaketMakanan {
    String namaPaket;
    int energi;
    MenuGizi menu;

    public PaketMakanan(String namaPaket, int energi, MenuGizi menu) {
        this.namaPaket = namaPaket;
        this.energi = energi;
        this.menu = menu;
    }

    public int beriEnergi(String target) {
        System.out.println("Paket makanan diberikan kepada " + target);
        return energi;
    }
}
