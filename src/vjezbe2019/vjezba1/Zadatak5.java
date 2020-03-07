package vjezbe2019.vjezba1;

import java.util.Scanner;

public class Zadatak5 {

    private final static long KB_FACTOR = 1024;
    private final static long MB_FACTOR = 1024 * KB_FACTOR;
    private final static long GB_FACTOR = 1024 * MB_FACTOR;

    public static void main(String[] args){

        System.out.println("Unesite MB: ");
        var mb = new Scanner(System.in).nextFloat();
        System.out.println("Unesite GB: ");
        var gb = new Scanner(System.in).nextFloat();

        System.out.println(mb + "MB = " + mb * MB_FACTOR + " byte \n" + gb + "GB = " + gb * GB_FACTOR );

    }

}
