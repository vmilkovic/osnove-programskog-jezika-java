package vjezbe2019.vjezba4;

public class Sedan extends Automobil {

    float duzina;
    KupacAutomobila kupac;

    public Sedan(float duzina, KupacAutomobila kupac) {
        this.duzina = duzina;
        this.kupac = kupac;
    }

    @Override
    double getProdajnaCijena() {
        if(duzina <= 4){
            return osnovnaCijena - (osnovnaCijena * 0.05);
        } else {
            return  osnovnaCijena - (osnovnaCijena * 0.10);
        }
    }

    String ispisSvihPodataka(){
        return kupac.toString();
    }

}
