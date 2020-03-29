package predavanja2019.predavanje4;

class Vehicle {
    int maxSpeed = 120;

    Vehicle(){
        System.out.println("Vehicle constructor!");
    }

    Vehicle(int newMaxSpeed){
        System.out.println("Vehicle constructor2!");
        maxSpeed = newMaxSpeed;
    }

    void display(){
        System.out.println("Maximum Speed: " + maxSpeed);
    }
}

class Car extends Vehicle {

    int maxSpeed = 180;

    Car(){
        super(200);
        System.out.println("Car constructor!");
    }

    void display(){
        super.display();
        //System.out.println("Maximum Speed: " + super.maxSpeed);
    }

    public static void main(String[] args) {
        Car small = new Car();
        small.display();
    }
}
