package vjezbe2020.vjezba4;

public class Main {

    public static void main(String[] args){

        Group pfizer  = new Group("Pfizer");

        Company Johnson = new Company("Johnson & Johnson", pfizer);
        Company Bayer = new Company("Roche", pfizer);

        Office newYork = new Office("New York", Johnson);
        Office paris = new Office("Paris", Johnson);

        System.out.println(newYork.getGroupName());
        System.out.println(Johnson.getCompanyName());
        System.out.println(newYork.getLocation());

        newYork.addToStorage("Zaštitne rukavice", "20", "30 i 50", "bijele i crne");
        newYork.addToStorage("Lupocet", "44");
        newYork.addToStorage("Dermazin", "55");

        paris.addToStorage("Salicilna kiselina", "800");

        Office london = new Office("London", Bayer);
        Office berlin = new Office("Berlin", Bayer);

        newYork.addToStorage("Zaštitne maske", "20", "30 i 50");
        newYork.addToStorage("Lupocet", "44");

        berlin.addToStorage("Prašak", "20");
        berlin.addToStorage("Maxitrol", "400");

        newYork.showStorage();
        berlin.showStorage();
        paris.showStorage();
        london.showStorage();


    }

}
