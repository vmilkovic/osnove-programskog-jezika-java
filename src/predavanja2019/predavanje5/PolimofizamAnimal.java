package predavanja2019.predavanje5;

class Animal {
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void eat(){
        System.out.println("Eating fruits");
    }
}

class BabyDog extends Dog {
   void eat(){
       System.out.println("Drink milk");
   }
}

class PolymorfizamAnimal {

    public static void main(String[] args) {

        Animal a1, a2, a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new BabyDog();

        a1.eat();
        a2.eat();
        a3.eat();

        System.out.println(a2 instanceof Animal);

        Animal d = new Dog();
        Dog dd = (Dog) new Animal();

    }

}