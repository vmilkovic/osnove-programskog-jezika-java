package predavanja2019.predavanje3;

public class Brojac {

    static int brojac = 0;

    Brojac(){
        brojac++;
    }

    void ispisBrojac(){
        System.out.println("Ukupno istanciranih objekata je: " + brojac);
    }

    public static void main(String[] args) {
        Brojac brojac1 = new Brojac();
        Brojac brojac2 = new Brojac();
        brojac2.ispisBrojac();
    }
}
