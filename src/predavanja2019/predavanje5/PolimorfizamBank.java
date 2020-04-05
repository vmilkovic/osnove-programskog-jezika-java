package predavanja2019.predavanje5;

class Bank {
    int getRateOfInterest(){
        return 0;
    }
}

class ABC extends Bank {
    int getRateOfInterest(){
        return 8;
    }
}

class DEF extends Bank {
    int getRateOfInterest(){
        return 7;
    }
}

class GHI extends Bank {
    int getRateOfInterest(){
        return 9;
    }
}

class PolymorfizamBank {

    public static void main(String args[]){
        Bank b1 = new ABC();
        Bank b2 = new DEF();
        Bank b3 = new GHI();

        System.out.println("ABC kamatna stopa: " + b1.getRateOfInterest());
        System.out.println("DEF kamatna stopa: " + b2.getRateOfInterest());
        System.out.println("GHI kamatna stopa: " + b3.getRateOfInterest());
    }

}