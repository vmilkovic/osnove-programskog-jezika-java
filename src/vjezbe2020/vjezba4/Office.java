package vjezbe2020.vjezba4;

import java.util.HashMap;
import java.util.Map;

public class Office implements Location, Storage {

    private String location;
    private Company company;
    private HashMap<String, Integer> storage;

    public Office(String location){
        setLocation(location);
        storage = new HashMap<>();
        this.company = new Company();
    }

    public Office(String location, Company company){
        setLocation(location);
        storage = new HashMap<>();
        this.company = company;
    }

    public void setLocation(String location){
        this.location = location;
    };

    public String getLocation(){
        return location;
    }

    public void addToStorage(String item, Integer amount) {
        storage.put(item, amount);
    }

    public void removeFromStorage(String item, Integer amount){
        if( storage.containsKey(item) ){
            storage.put(item, storage.get(item) - amount);
        }
    }

    public void removeFromStorage(String item, String amount){
        if( storage.containsKey(item) && amount.equals("all") ){
            storage.remove(item);
        }
    }

    public void showStorage(){
        for(Map.Entry<String, Integer> item : storage.entrySet()){
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }

    public String getCompanyName(){
        return company.getCompanyName();
    }

    public String getGroupName(){
        return this.company.getGroupName();
    }

}
