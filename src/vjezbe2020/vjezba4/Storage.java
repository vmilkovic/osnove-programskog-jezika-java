package vjezbe2020.vjezba4;

public interface Storage {

    void addToStorage(String item, String amount );
    void addToStorage(String item, String amount, String perAmount );
    void addToStorage(String item, String amount, String perAmount, String color );

    void showStorage();

}
