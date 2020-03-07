package vjezbe2020.vjezba1;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args){

        System.out.print("Input a number: ");
        float radius = new Scanner(System.in).nextFloat();


        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }

}
