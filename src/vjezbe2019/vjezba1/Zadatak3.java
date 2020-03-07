package vjezbe2019.vjezba1;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args){

        final float PI = 3.14159265359f;
        float radijus = 0;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesi radijus kruga: ");
        radijus = ulaz.nextFloat();
        float povrsina = radijus * radijus * PI;
        System.out.println("Povrsina kruga iznosi " + povrsina);

    }
}

