package vjezbe2019.vjezba3;

public class Knjigovodstvo {
    Racun ulazni;
    Racun izlazni;

    Knjigovodstvo(Racun ulazni, Racun izlazni){
        this.ulazni = ulazni;
        this.izlazni = izlazni;
    }

    public double izracunajDobit(){
        return ulazni.izracunajCijenu() - izlazni.izracunajCijenu();
    }

    public static void main(String[] args) {
        Racun ulazniRacun = new Racun(131636, "Grafička kartica", 3, 2000.00);
        Racun izlazniRacun = new Racun(131636, "Režije", 1, 1567.33);
        Knjigovodstvo knjigovodstvo = new Knjigovodstvo(ulazniRacun, izlazniRacun);
        System.out.println(knjigovodstvo.izracunajDobit());

    }
}
