package vjezbe2019.vjezba2;

public class Zadatak2 {

    private int offset = 0;
    static char[] chars = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'A', 'B', 'C', 'D',
            'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z', '!', '@',
            '#', '$', '%', '^', '&', '(', ')', '+',
            '-', '*', '/', '[', ']', '{', '}', '=',
            '<', '>', '?', '_', '"', '.', ',', ' '
    };

    void zadajKljuc(int offset){
        this.offset = offset;
    }

    String enkodirajTekst(String text) {

        char[] plain = text.toCharArray();

        for (int i = 0; i < plain.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (j <= chars.length - this.offset) {
                    if (plain[i] == chars[j]) {
                        plain[i] = chars[j + this.offset];
                        break;
                    }
                }
                else if (plain[i] == chars[j]) {
                    plain[i] = chars[j - (chars.length - offset + 1)];
                }
            }
        }
        return String.valueOf(plain);
    }

    String dekodirajTekst(String cip) {

        char[] cipher = cip.toCharArray();
        for (int i = 0; i < cipher.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (j >= offset && cipher[i] == chars[j]) {
                    cipher[i] = chars[j - this.offset];
                    break;
                }
                if (cipher[i] == chars[j] && j < this.offset) {
                    cipher[i] = chars[(chars.length - this.offset +1) + j];
                    break;
                }
            }
        }
        return String.valueOf(cipher);
    }

    public static void main(String[] args) {

        Zadatak2 zadatak2 = new Zadatak2();
        zadatak2.zadajKljuc(2);

        String text = "Neki tekst!";
        System.out.println("Enkodirani tekst: " +  zadatak2.enkodirajTekst(text));
        System.out.println("Dekodirani tekst: " + zadatak2.dekodirajTekst(zadatak2.enkodirajTekst(text)));

    }

}
