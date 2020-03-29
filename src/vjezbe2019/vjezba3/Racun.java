package vjezbe2019.vjezba3;

public class Racun {

    private int sifra;
    private String opis;
    private int prodano;
    private double cijena;

    Racun(int sifra, String opis, int prodano, double cijena){
        setSifra(sifra);
        setOpis(opis);
        setProdano(prodano);
        setCijena(cijena);
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public double getCijena() {
        return cijena;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

    public void setProdano(int prodano) {
        this.prodano = prodano;
    }

    public int getProdano() {
        return prodano;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public int getSifra() {
        return sifra;
    }

    public double izracunajCijenu(){
        return prodano * cijena;
    }

}
