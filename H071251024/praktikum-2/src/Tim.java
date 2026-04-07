public class Tim {
    public String MiddleBlocker;
    public String Setter;
    public Spiker spiker;

    public Tim(Spiker spiker){
        this.spiker = spiker;
        this .MiddleBlocker = "Mi Waa";
        this.Setter = "Da Hee";
    }

    public Tim(String MiddleBlocker, String Setter, Spiker spiker){
        this.MiddleBlocker = MiddleBlocker;
        this.Setter = Setter;
        this.spiker = spiker;
    }

    public void RecieveBall(Spiker lawan){
        System.out.println(this.MiddleBlocker + " menerima bola dari " + lawan.nama + "!");

        System.out.println(this.MiddleBlocker + " mengoper bola ke " + this.Setter + "!");
        System.out.println(this.Setter + " siap untuk melakukan set!");
        System.out.println(this.Setter + " melakukan set ke " + this.spiker.nama + "!");
        System.out.println(this.spiker.nama + " siap untuk melakukan smash!");


    }

}
