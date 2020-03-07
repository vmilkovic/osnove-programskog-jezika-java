package predavanja2019.predavanje1;

public class Lampa {

    private boolean inOn;

    public void upali(){
        inOn = true;
    }

    public void ugasi(){
        inOn=false;
    }

    void prikaziStatusLampe(){
        System.out.println("Light on? " + inOn);
    }

    public static void main(String[] args){
        Lampa mojaLampa = new Lampa();
        mojaLampa.upali();
        mojaLampa.ugasi();
        mojaLampa.prikaziStatusLampe();
    }

}
