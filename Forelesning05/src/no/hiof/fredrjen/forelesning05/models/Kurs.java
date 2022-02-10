package no.hiof.fredrjen.forelesning05.models;


public class Kurs{

        // Instansvariabler
        private String kursNavn;
        private String kursKode;
        private int studiePoeng;

        public Kurs (String kursNavn, String kursKode, int studiePoeng){
                this.kursNavn = kursNavn;
                this.kursKode = kursKode;
                this.studiePoeng = studiePoeng;


        }
        public void printBeskrivelse(){
                System.out.println("Kursnavn: " + kursNavn + " \n" +
                                "Kurskode: " + kursKode + "\n" +
                        "Studiepoeng: " + studiePoeng + "\n");
        }

        public String getKursNavn() {
                return kursNavn;
        }

        public void setKursNavn(String kursNavn) {
                this.kursNavn = kursNavn;
        }

        public String getKursKode() {
                return kursKode;
        }

        public void setKursKode(String kursKode) {
                this.kursKode = kursKode;
        }

        public int getStudiePoeng() {
                return studiePoeng;
        }

        public void setStudiePoeng(int studiePoeng) {
                this.studiePoeng = studiePoeng;
        }
}