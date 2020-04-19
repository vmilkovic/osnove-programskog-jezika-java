package vjezbe2020.vjezba7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {

    private Set<String> set;

    public HashSets(){
        set = new HashSet(Arrays.asList("SetItem1", "SetItem2", "SetItem3", "SetItem4", "SetItem5"));
    }

    public void showSet(){
        System.out.println(set);
    }

    public void showCount(){
        System.out.println(set.size());
    }

    public void deleteSet(){

        showSet();

        Iterator<String> setIterator = set.iterator();

        while(setIterator.hasNext()){
            setIterator.next();
            setIterator.remove();
        }

        showSet();
    }

}
