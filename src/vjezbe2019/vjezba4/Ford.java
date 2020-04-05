package vjezbe2019.vjezba4;

public class Ford extends Automobil {

    int godinaProizvodnje;
    int proizvodacevPopust;
    KupacAutomobila kupac;

    public Ford(int proizvodacevPopust, KupacAutomobila kupac) {
        this.proizvodacevPopust = proizvodacevPopust;
        this.kupac = kupac;
    }

    @Override
    double getProdajnaCijena(){
        return osnovnaCijena - proizvodacevPopust;
    }

    String ispisSvihPodataka(){
        return kupac.toString();
    }

}
