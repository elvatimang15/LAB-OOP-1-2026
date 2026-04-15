public class Main {
    public static void main(String[] args) {

        Kitab kitab1 = new Kitab("Tafsir Jalalain", 500);
        Kitab kitab2 = new Kitab("Riyadhus Shalihin", 300);

        Santri santri1 = new Santri("Fauzi", 5, kitab1);
        Santri santri2 = new Santri("Alim", 3, kitab2);
        
        santri1.tampilkanInfo();
        santri2.tampilkanInfo();

        santri1.tambahHafalan(2);

        santri1.murojaah(santri2);

        santri1.tampilkanInfo();
        santri2.tampilkanInfo();
    }
}