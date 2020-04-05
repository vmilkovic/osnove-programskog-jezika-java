package predavanja2019.predavanje5;

abstract class AbstractBank {
    abstract int getRateOfInterest();
}

class PBZ extends AbstractBank {
    int getRateOfInterest(){
        return 7;
    }
}

class ZABA extends AbstractBank {
    int getRateOfInterest(){
        return 8;
    }
}

class AbstractBankMain {
    public static void main(String[] args) {
        AbstractBank b = new PBZ();
        int interest = b.getRateOfInterest();
        System.out.println("Rate of Interst is: " + interest + "%");
    }
}