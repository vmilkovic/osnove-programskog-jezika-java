package predavanja2019.predavanje5;

interface PrintablePolimorfizam {}

class A implements PrintablePolimorfizam {
    public void a(){
        System.out.println("a metoda");
    }
}

class B implements PrintablePolimorfizam {
    public void b(){
        System.out.println("b metoda");
    }
}

class Call {
    void invoke(PrintablePolimorfizam p){
        if(p instanceof A){
            A a = (A)p; // Downcasting
            a.a();
        }
        if(p instanceof B){
            B b = (B) p; // Downcasting
            b.b();
        }
    }
}

class Polymorfizam {
    public static void main(String[] args) {
        PrintablePolimorfizam p = new B();
        Call c = new Call();
        c.invoke(p);
    }
}