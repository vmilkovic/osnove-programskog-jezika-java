package vjezbe2020.vjezba1;

import java.util.ArrayList;

public class Zadatak5 {

    public static void main(String[] args){

        StringBuilder by3 = new StringBuilder();
        StringBuilder by5 = new StringBuilder();
        StringBuilder by3and5 = new StringBuilder();

        for(int i=1; i<100; i++){
            if(i%3==0 && i%5==0) by3and5.append(i).append(", ");
            else if(i%3==0) by3.append(i).append(", ");
            else if(i%5==0) by5.append(i).append(", ");
        }

        System.out.println("Divided by 3:\n\t" + by3);
        System.out.println("Divided by 5:\n\t" + by5);
        System.out.println("Divided by 3 & 5:\n\t" + by3and5);

    }

}
