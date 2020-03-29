package predavanja2019.predavanje4;

public class Bank {
    int getRateOfInterest(){
        return 0;
    }
}

class FIRST extends Bank {
    int getRateOfinterest(){
        return 8;
    }
}

class SECOND extends Bank {
    int getRateOfinterest(){
        return 7;
    }
}

class THIRD extends Bank {
    int getRateOfinterest(){
        return 9;
    }
}

class Main {
    public static void main(String[] args) {
        FIRST s = new FIRST();
        SECOND i = new SECOND();
        THIRD a = new THIRD();

        System.out.println("FIRST Rate of Interest: " + s.getRateOfinterest());
        System.out.println("SECOND Rate of Interest: " + i.getRateOfinterest());
        System.out.println("THIRD Rate of Interest: " + a.getRateOfinterest());

    }
}