package vjezbe2019.vjezba4;

public class MojaAutoTrgovina {
    public static void main(String[] args) {

        KupacAutomobila kupac = new KupacAutomobila("Pero", "Peric", "Ulica 52", "Zagreb",
                74165, 131341489);

        KupacAutomobila kupac2 = new KupacAutomobila("Đuro", "Đurić", "Ulica 62", "Koprivnica",
                76765, 131341489);

        kupac.equals(kupac2);

        Kamion kamion = new Kamion(2500, kupac);
        System.out.println(kamion.getProdajnaCijena());
        System.out.println(kamion.ispisSvihPodataka());

        Ford ford = new Ford( 500, kupac );
        System.out.println(ford.getProdajnaCijena());
        System.out.println(ford.ispisSvihPodataka());

        Sedan sedan = new Sedan(5, kupac2);
        System.out.println(sedan.getProdajnaCijena());
        System.out.println(sedan.ispisSvihPodataka());

    }
}
