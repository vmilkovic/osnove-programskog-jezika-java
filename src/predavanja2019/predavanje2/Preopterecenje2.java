package predavanja2019.predavanje2;

public class Preopterecenje2 {

    void sum(int a, long b){System.out.println(a+b);}
    void sum(int a, int b, int c){System.out.println(a+b+c);}

    public static void main(String args[]){
        Preopterecenje2 obj = new Preopterecenje2();
        obj.sum(20,20); // new second int literal will be promoted to long
        obj.sum(20,20,20);
    }

}
