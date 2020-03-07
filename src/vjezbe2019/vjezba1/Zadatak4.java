package vjezbe2019.vjezba1;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args){

        Scanner mojSkener = new Scanner(System.in);
        System.out.println("Unesite neki tekst: ");
        String tekst = mojSkener.nextLine().toLowerCase();

        int brojacSamoglasnika = 0;

        for(int i=0; i<tekst.length(); i++){
            if(tekst.charAt(i)=='a') brojacSamoglasnika++;
            if(tekst.charAt(i)=='e') brojacSamoglasnika++;
            if(tekst.charAt(i)=='i') brojacSamoglasnika++;
            if(tekst.charAt(i)=='o') brojacSamoglasnika++;
            if(tekst.charAt(i)=='u') brojacSamoglasnika++;
        }

        System.out.println("Broj samoglasnika je: " + brojacSamoglasnika);
        System.out.println("Brojac suglasnika je: " + (tekst.length() - brojacSamoglasnika));

    }

}
