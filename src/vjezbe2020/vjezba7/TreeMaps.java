package vjezbe2020.vjezba7;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {

    private Map treeMap;

    public TreeMaps(){
        treeMap = new TreeMap() {{
            put(4, "TreeMapItem1");
            put(3, "TreeMapItem2");
            put(2, "TreeMapItem3");
            put(1, "TreeMapItem4");
            put(0, "TreeMapItem5");
        }};
    }

    public void showTreeMap(){
        System.out.println(treeMap);
    }

    public void deleteTreeMap(){
        treeMap.clear();
    }

}
