package vjezbe2020.vjezba1;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args){

        System.out.print("Input number: ");
        int number = new Scanner(System.in).nextInt();

        if( number > 0 ){
            System.out.println("Number is positive");
        } else {
            System.out.println(("Number is negative"));
        }

    }

}
