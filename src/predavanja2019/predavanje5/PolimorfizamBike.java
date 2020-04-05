package predavanja2019.predavanje5;

class Bike {
    int speedLimit = 90;
    void run(){
        System.out.println("Vozi");
    }
}

class Splender extends Bike {
    void run(){
        System.out.println("Vozi sigurno 60km/h");
    }
}

class Honda3 extends Bike {
    int speedLimit = 150;
}

class PolymorfizamBike {

    public static void main(String[] args) {
        Bike b1 = new Splender();
        b1.run();
        Bike b2 = new Honda3();
        System.out.println(b2.speedLimit);
    }

}
