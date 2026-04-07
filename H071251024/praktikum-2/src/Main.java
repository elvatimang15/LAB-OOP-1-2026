public class Main {
    public static void main(String[] args) {
        Sepatu NikeDunkPanda = new Sepatu("Nike Dunk Panda", 10);
        Sepatu AdidasCrazyFlight = new Sepatu("Adidas Crazy Flight", 7);

        Spiker spiker1 = new Spiker("Nishikawa", 120, NikeDunkPanda);
        Spiker spiker2 = new Spiker("Na Gi");

        Tim tim1 = new Tim("Claire", "Elio", spiker1);
        Tim tim2 = new Tim(spiker2);

        spiker1.GetInfoPlayer();
        spiker2.GetInfoPlayer();

        spiker2.gantiSepatu(AdidasCrazyFlight);
        spiker2.GetInfoPlayer();

        spiker2.smashTebas(spiker1);
        tim1.RecieveBall(spiker2);
        spiker1.smashTebas(spiker2);

        System.out.println("HASIL");
        System.out.println("Setelah pertarungan sengit, " + spiker1.nama + " memiliki stamina " + spiker1.stamina);
        System.out.println("Setelah pertarungan sengit, " + spiker2.nama + " memiliki stamina " + spiker2.stamina);
    }
}