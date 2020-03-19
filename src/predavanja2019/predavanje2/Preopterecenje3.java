package predavanja2019.predavanje2;

public class Preopterecenje3 {

    void sum(int a, long b){System.out.println("Poziv1");}
    void sum(long a, int b){System.out.println("Potiv2");}

    public static void main(String args[]){
        Preopterecenje3 obj = new Preopterecenje3();
        //obj.sum(20, 20); // Error: ambigous call both method sum match
    }

}
