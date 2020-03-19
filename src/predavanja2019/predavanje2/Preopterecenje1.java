// Napišite klasu koja zbraja dva ili tri cijela broja,
// ovisno o zadanom broju ulaznih argumenata!

package predavanja2019.predavanje2;

public class Preopterecenje1 {

    void zbroji(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void zbroji(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args){

        new Preopterecenje1().zbroji(10, 20);
        new Preopterecenje1().zbroji(10,20,30);

    }

}
