package vjezbe2020.vjezba4;

public interface Storage {

    void addToStorage(String item, Integer amount);

    void removeFromStorage(String item, Integer amount);

    void removeFromStorage(String item, String amount);

    void showStorage();

}
