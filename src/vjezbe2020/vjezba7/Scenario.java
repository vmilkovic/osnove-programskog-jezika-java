package vjezbe2020.vjezba7;

public class Scenario {

    public void run(){

        ArrayLists arrayList = new ArrayLists();
        arrayList.showList();
        arrayList.obrniListu();
        arrayList.showList();

        System.out.println("-------------------------");

        HashSets hashSet = new HashSets();
        hashSet.showCount();
        hashSet.deleteSet();

        System.out.println("-------------------------");

        TreeSets treeSet = new TreeSets();
        treeSet.addToTreeSet();

        System.out.println("-------------------------");

        HashMaps hashMap = new HashMaps();
        hashMap.showHashMapEntry();
        hashMap.hasKey(3);
        System.out.println(hashMap.getValue(2));
        hashMap.showValues();

        System.out.println("-------------------------");

        TreeMaps treeMap = new TreeMaps();
        treeMap.showTreeMap();
        treeMap.deleteTreeMap();
        treeMap.showTreeMap();

    }

}
