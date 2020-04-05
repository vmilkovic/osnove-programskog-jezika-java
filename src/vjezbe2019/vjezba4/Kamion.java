package vjezbe2019.vjezba4;

public class Kamion extends Automobil {

    int tezina;
    KupacAutomobila kupac;

    Kamion(int tezina, KupacAutomobila kupac){
        super();
        this.tezina = tezina;
        this.kupac = kupac;
    }

    @Override
    double getProdajnaCijena(){
        if( tezina > 2000 ){
            return osnovnaCijena - (osnovnaCijena * 0.1);
        } else {
            return osnovnaCijena - (osnovnaCijena * 0.2);
        }
    }

    String ispisSvihPodataka(){
        return kupac.ime + " " + kupac.prezime + " " + kupac.ulica + " " + kupac.grad + " " + kupac.posBroj + " " + kupac.OIB;
    }

}
