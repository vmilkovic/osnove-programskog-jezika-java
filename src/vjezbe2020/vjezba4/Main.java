package vjezbe2020.vjezba4;

public class Main {

    public static void main(String[] args){

        Company company = new Company("Bayer", "Belupo");
        Office koprivnica = new Office("Koprivnica", company);
        Office zagreb = new Office("Zagreb", company);

        System.out.println(koprivnica.getCompanyName());
        System.out.println(koprivnica.getGroupName());
        System.out.println(koprivnica.getLocation());

        koprivnica.addToStorage("Voltaren", 20);
        koprivnica.addToStorage("Lupocet", 44);
        koprivnica.addToStorage("Dermazin", 55);

        koprivnica.showStorage();

        koprivnica.removeFromStorage("Lupocet", 4);
        koprivnica.removeFromStorage("Dermazin", 5);
        koprivnica.removeFromStorage("Voltaren", "all");

        zagreb.addToStorage("Salicilna kiselina", 800);

        koprivnica.showStorage();
        zagreb.showStorage();

    }

}
