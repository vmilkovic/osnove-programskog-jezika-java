// Instancirajte niz veličine 5 upišite u njega neke vrijednosti (inicijalizacija)
// te ispišite vrijednosti na standardni izlaz

package predavanja2019.predavanje2;

public class JavaNizovi {

    public static void main(String[] args){
        // deklaracija i instanciranje
        int a[] = new int[5];

        // inicijalizacija
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]); //pristup elementu na mjestu i
        }

    }
}
