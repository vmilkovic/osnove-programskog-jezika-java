package predavanja2019.predavanje5;

interface InterfaceBank {
    int geteRateOfInterest();
}

class SBI implements InterfaceBank {
    public int geteRateOfInterest() {
        return 7;
    }
}

class PNB implements InterfaceBank {
    public int geteRateOfInterest() {
        return 8;
    }
}

class InterfaceBankMain {
    public static void main(String[] args) {
        InterfaceBank b = new SBI();
        int interest = b.geteRateOfInterest();
        System.out.println("Rate of interest is: " + interest + "%");
    }
}