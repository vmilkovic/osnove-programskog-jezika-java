package predavanja2019.predavanje4;

public class Zaposlenik {

    int id;
    String ime;
    Adresa adresa;

    public Zaposlenik(int id, String ime, Adresa adresa) {
        this.id = id;
        this.ime = ime;
        this.adresa = adresa;
    }

    void display(){
        System.out.println(id + " " + ime);
        System.out.println(adresa.drzava + " " + adresa.grad);
    }

    public static void main(String[] args) {
        Adresa adresa1 = new Adresa("ZG", "HR");
        Adresa adresa2 = new Adresa("BJ", "HR");

        Zaposlenik z1 = new Zaposlenik(111, "Petar", adresa1);
        Zaposlenik z2 = new Zaposlenik(222, "Marko", adresa2);

        z1.display();
        z2.display();

    }
}
