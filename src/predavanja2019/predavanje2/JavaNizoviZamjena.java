// Napišite metodu koja će primiti niz cijelih brojeva
// te sve brojeve manje od nula postaviti na nulu tako
// da metoda ne mijenja originalan niz!

package predavanja2019.predavanje2;

public class JavaNizoviZamjena {

    int[] zamjeniElemente(int[] niz){
        int[] noviniz = niz.clone();
        for(int i=0; i<niz.length; i++){
            if(niz[i]<0) noviniz[i] = 0;
        }
        return noviniz;
    }

    public static void main(String[] args){

        int[] mojNiz = {4, 10, -5, -7, 30, 60};
        int[] noviNiz = new JavaNizoviZamjena().zamjeniElemente(mojNiz);

        System.out.println("Stari niz: ");
        for( int a:mojNiz ){
            System.out.println(a);
        }

        System.out.println("novi niz:");
        for( int a:noviNiz ){
            System.out.println(a);
        }

    }

}
