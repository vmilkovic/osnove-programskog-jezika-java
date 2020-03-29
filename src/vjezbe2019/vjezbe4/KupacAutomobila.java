package vjezbe2019.vjezbe4;

public class KupacAutomobila {
    String ime;
    String prezime;
    String ulica;
    String grad;
    int posBroj;
    int OIB;
    KupacAutomobila kupac;

    public KupacAutomobila(String ime, String prezime, String ulica, String grad, int posBroj, int OIB) {
        this.ime = ime;
        this.prezime = prezime;
        this.ulica = ulica;
        this.grad = grad;
        this.posBroj = posBroj;
        this.OIB = OIB;
    }

    void equals(KupacAutomobila kupac){
        if( OIB == kupac.OIB ){
            if(ime != kupac.ime){
                System.out.println("Ime kupca nije isto");
            }
            if(prezime != kupac.prezime){
                System.out.println("Prezime kupca nije isto");
            }
            if(ulica != kupac.ulica){
                System.out.println("Ulica kupca nije isto");
            }
            if(grad != kupac.grad){
                System.out.println("Grad kupca nije isto");
            }
            if(posBroj != kupac.posBroj){
                System.out.println("Poštanski broj kupca nije isto");
            }
        } else {
            System.out.println("Kupci nisu isti!");
        }
    }

    public String toString(){
        return ime + " " + prezime + " " + ulica + " " + grad + " " + posBroj + " " + OIB;
    }

}
