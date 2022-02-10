public class Pult {
        public String navn;
        public int høyde;
        public int bredde;
        public int dybde;
        public String pultID;

        Pult(String n, int h, int b, int d, String i) {
            this.navn = n;
            this.bredde = b;
            this.høyde = h;
            this.dybde = d;
            this.pultID = i;
        }


    void skrivUtPult() {
        System.out.println("Pult-navn: " + this.navn + "\n" + "Høyde: " + this.høyde + "\n" + this.bredde + "\n" + this.dybde + "\n" + this.pultID);

    }
}






