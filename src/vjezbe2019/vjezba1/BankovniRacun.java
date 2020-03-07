package vjezbe2019.vjezba1;

public class BankovniRacun {

    private double stanjeRacuna = 0;

    public void uplatiNaRacun(double vrijednost){
        this.stanjeRacuna+=vrijednost;
    }

    public void isplatiSRacuna(double vrijednost){
        this.stanjeRacuna-=vrijednost;
    }

    public void ispisStanjeRacuna(){
        System.out.println("Stanje racuna je " + this.stanjeRacuna);
    }

    public static void main(String[] args){

        BankovniRacun bankovniRacun = new BankovniRacun();
        bankovniRacun.uplatiNaRacun(100);
        bankovniRacun.isplatiSRacuna(40);
        bankovniRacun.ispisStanjeRacuna();

    }

}
