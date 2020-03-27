package vjezbe2020.vjezba4;

import java.util.*;

public class Office implements Location, Storage {

    private String location;
    private Company company;
    private HashMap<String, List<String>> storage;

    public Office(String location){
        setLocation(location);
        storage = new HashMap<String, List<String>>();
        this.company = new Company();
    }

    public Office(String location, Company company){
        setLocation(location);
        storage = new HashMap<String, List<String>>();
        this.company = company;
    }

    public void setLocation(String location){
        this.location = location;
    };

    public String getLocation(){
        return location;
    }

    public void addToStorage(String item, String amount ) {
        List<String> status = new ArrayList<>();
        status.add(amount);
        storage.put(item, status);
    }

    public void addToStorage(String item, String amount, String perAmount ) {
        List<String> status = new ArrayList<>();
        status.add(amount);
        status.add(perAmount);
        storage.put(item, status);
    }

    public void addToStorage(String item, String amount, String perAmount, String color ) {
        List<String> status = new ArrayList<>();
        status.add(amount);
        status.add(perAmount);
        status.add(color);
        storage.put(item, status);
    }

    public void showStorage(){
        if( !storage.isEmpty() ) {
            for (Map.Entry<String, List<String>> item : storage.entrySet()) {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                for (String status : item.getValue()) {
                    if (i == 0) {
                        sb.append(status);
                    } else if (i == 1) {
                        sb.append(" - (pakiranja od " + status + " komada)");
                    } else if (i == 2) {
                        sb.append(" - " + status + " boje");
                    }
                    i++;
                }
                System.out.println(item.getKey() + ": " + sb);
            }
        } else {
            System.out.println(this.location + " storage is empty!");
        }
    }

    public String getCompanyName(){
        return this.company.getCompanyName();
    }

    public String getGroupName(){
        return this.company.getGroupName();
    }

}
