package vjezbe2019.vjezba5;

class KupacAutomobila {
    private String Ime;
    private String Prezime;
    private String Ulica;
    private String Grad;
    private String OIB;
}

class Vozilo {
    private int maksimalnaBrzina;
    private double osnovnaCijena;
    private String Boja;

    Vozilo(int brzina, double cijena, String boja){
        maksimalnaBrzina = brzina;
        osnovnaCijena = cijena;
        Boja = boja;
    }

    double getProdajnaCijena(){
        return osnovnaCijena;
    }

}

class TeretnoVozilo extends Vozilo {
    private int tezinaTeretnogVozila;

    TeretnoVozilo(int brzina, double cijena, String boja, int tezina) {
        super(brzina, cijena, boja);
        tezinaTeretnogVozila = tezina;
    }

    double getProdajnaCijena(){
        if(tezinaTeretnogVozila > 2000){
            return super.getProdajnaCijena() - (super.getProdajnaCijena() * 0.1);
        } else {
            return super.getProdajnaCijena() - (super.getProdajnaCijena() * 0.2);
        }
    }

}

class OsobniAutomobil extends Vozilo {
    private int emisijaCO2;

    OsobniAutomobil(int brzina, double cijena, String boja, int emisija) {
        super(brzina, cijena, boja);
        emisijaCO2 = emisija;
    }

    double getProdajnaCijena(){
        if( emisijaCO2 < 100 ){
            return super.getProdajnaCijena() - (super.getProdajnaCijena() * 0.2);
        } else if( emisijaCO2 >= 100 && emisijaCO2 <= 140 ){
            return super.getProdajnaCijena() - (super.getProdajnaCijena() * 0.1);
        } else {
            return super.getProdajnaCijena() + (super.getProdajnaCijena() * 0.1);
        }
    }
}

class MojaAutoTrgovina {
    public static void main(String[] args) {
       TeretnoVozilo teretnoVozilo = new TeretnoVozilo(100, 150000, "Plava", 20000);
       OsobniAutomobil osobniAutomobil = new OsobniAutomobil(200, 100000, "Srebrna", 120);

       System.out.println(teretnoVozilo.getProdajnaCijena());
       System.out.println(osobniAutomobil.getProdajnaCijena());

    }
}