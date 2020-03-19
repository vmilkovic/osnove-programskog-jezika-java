// Napišite metodu koja za zadani niz traži najveći broj!

package predavanja2019.predavanje2;

public class JavaNajveci {

    int traziNajveci(int niz[]){
        int najveci = niz[0];
        for(int i = 0; i < niz.length; i++){

            if(najveci < niz[i]){
                najveci = niz[i];
            }
        }
        return najveci;
    }

    public static void main(String args[]){
        int mojNiz[] = {26, 5, 23, 5};
        JavaNajveci jN = new JavaNajveci();
        int najveci = jN.traziNajveci(mojNiz);
        System.out.println(najveci);
    }

}
