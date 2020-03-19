// Napišite program koji ispisuje sve ASCII znakove String niza
// korištenjem for-each petlje.

package predavanja2019.predavanje2;

public class StringByte {

    public static void main(String args[]){
        String s = "Neki tekst";
        byte[] bitovi = s.getBytes();

        for(byte znak:bitovi){
            System.out.print(znak + " ");
        }
    }

}
