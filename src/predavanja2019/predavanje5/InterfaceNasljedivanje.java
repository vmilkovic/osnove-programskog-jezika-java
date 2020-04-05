package predavanja2019.predavanje5;

interface PrintableNasljedivanje {
    void print();
}

interface ShowableNasljedivanje {
    void show();
}

class A7 implements PrintableNasljedivanje, ShowableNasljedivanje {
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }
}

class InterfaceNasljedivanjeMain {
    public static void main(String[]args){
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}