package vjezbe2020.vjezba7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

    private List<String> myList;

    ArrayLists(){
        myList = new ArrayList<>();
        myList = Arrays.asList("ListItem1", "ListItem2", "ListItem3", "ListItem4", "ListItem5");
    }

    public void showList(){
        System.out.println(myList);
    }

    public void obrniListu(){
        Collections.reverse(myList);
    }



}
