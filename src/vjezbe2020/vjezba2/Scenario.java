package vjezbe2020.vjezba2;

public class Scenario {

    public void run(){

        var marko = new Person("Marko", 23, 180.0, "brown");
        var ante = new Person("Ante", 22, 175.0, "blue");

        var bmw = new Car("BMW");

        var coffeeShop = new Location("coffeeShop");
        var anteHome = new Location("Ante's home");
        var markoHome = new Location("Marko's home");

        // to the coffee shop
        marko.unlock(bmw);
        marko.open(bmw);
        marko.goInside(bmw);
        marko.close(bmw);
        marko.start(bmw);
        marko.goTo(coffeeShop, bmw);
        marko.stop(bmw);
        marko.open(bmw);
        marko.goOutside(bmw);
        marko.close(bmw);
        marko.lock(bmw);

        // after the coffee shop
        marko.unlock(bmw);
        marko.open(bmw);
        marko.goInside(bmw);
        marko.close(bmw);
        marko.start(bmw);
        ante.open(bmw);
        ante.goInside(bmw);
        ante.close(bmw);
        marko.goTo(anteHome, bmw);
        marko.goTo(markoHome, bmw);
        marko.stop(bmw);
        marko.open(bmw);
        marko.goOutside(bmw);
        marko.close(bmw);
        marko.lock(bmw);

    }

}
