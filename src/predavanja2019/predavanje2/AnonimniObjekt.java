package predavanja2019.predavanje2;

public class AnonimniObjekt {

    void faktorijela(int n){
        int fakto=1;
        for(int i=1; i<=n; i++)
            fakto*=i;
        System.out.println("Faktorijel broja je: " + fakto);
    }

    public static void main(String[] args){
        new AnonimniObjekt().faktorijela(10);
        AnonimniObjekt r1 = new AnonimniObjekt(), r2 = new AnonimniObjekt();
    }

}
