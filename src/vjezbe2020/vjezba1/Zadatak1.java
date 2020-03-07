package vjezbe2020.vjezba1;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args){

        System.out.println("Input a number: ");
        int number = new Scanner(System.in).nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(number * i);
        }

    }

}
