package vjezbe2019.vjezba3;

public class Zaposlenik {

    private String ime;
    private String prezime;
    private int placa;
    private static String poslodavac;

    Zaposlenik(String ime, String prezime, int placa){
        this.ime = ime;
        this.prezime = prezime;
        this.placa = Math.max(placa, 0);
    }

    public void setIme(String ime){
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setPrezime(String prezime){
        this.prezime = prezime;
    }

    public String getPrezime(){
        return prezime;
    }

    public void setPlaca(int placa){
        this.placa = Math.max(placa, 0);
    }

    public int getPlaca(){
        return placa;
    }

    public static void setPoslodavac(String poslodavac){
        Zaposlenik.poslodavac = poslodavac;
    }

    public static String getPoslodavac(){
        return Zaposlenik.poslodavac;
    }

    public void uvecajPlacu(float postotak){
        this.placa = (int) (postotak * placa) + placa;
    }

}
