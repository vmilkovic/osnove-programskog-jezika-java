package vjezbe2020.vjezba1;

public class Zadatak3 {

    public static void  main(String args[]){

        int a = 1;
        int b = 5;

        System.out.println("A = " + a + "\nB = " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("A = " + a + "\nB = " + b);

    }

}
