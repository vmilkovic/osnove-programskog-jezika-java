package vjezbe2019.vjezba3;

public class ZaposlenikTest {

    public static void main(String[] args) {
        Zaposlenik zaposlenik1 = new Zaposlenik("Vedran", "Milkovic", 8000);
        Zaposlenik zaposlenik2 = new Zaposlenik("Pero", "Peric", 15000);

        System.out.println(zaposlenik1.getPlaca());
        System.out.println(zaposlenik2.getPlaca());

        zaposlenik1.uvecajPlacu((float)0.5);
        zaposlenik2.uvecajPlacu((float) 0.5);

        System.out.println(zaposlenik1.getPlaca());
        System.out.println(zaposlenik2.getPlaca());
    }

}
