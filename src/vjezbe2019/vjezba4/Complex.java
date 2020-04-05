package vjezbe2019.vjezba4;

public class Complex {

    int a;
    int b;

    Complex(int a, int b){
        this.a = a;
        this.b = b;
    }

    Boolean equals(){
        return a == b;
    }

    String toString(int broj){
        return Integer.toString(broj);
    }

}
