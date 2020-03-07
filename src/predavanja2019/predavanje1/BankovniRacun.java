package predavanja2019.predavanje1;

public class BankovniRacun {

    private double stanjeRacuna = 0;

    public void uplatiNaRacun(double vrijednost) {
        this.stanjeRacuna += vrijednost;
    }

    public void isplatiSRacuna(double vrijednost){
        this.stanjeRacuna -= vrijednost;
    }

    public void ispisiStanjeRacuna(){
        System.out.println("Stanje racuna je " + this.stanjeRacuna);
    }

    public static void main(String[] args){
        BankovniRacun noviRacun = new BankovniRacun();
        noviRacun.uplatiNaRacun(100);
        noviRacun.isplatiSRacuna(40);
        noviRacun.ispisiStanjeRacuna();
    }

}
