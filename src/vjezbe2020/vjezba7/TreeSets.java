package vjezbe2020.vjezba7;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

    private Set<String> tree1;
    private Set<String> tree2;

    public TreeSets(){
        tree1 = new TreeSet<>(Arrays.asList("TreeSet1Item1", "TreeSet1Item2", "TreeSet1Item3", "TreeSet1Item4", "TreeSet1Item5"));
        tree2 = new TreeSet<>(Arrays.asList("TreeSet2Item1", "TreeSet2Item2", "TreeSet2Item3", "TreeSet2Item4", "TreeSet2Item5"));
    }

    public void showTreeSets(){
        System.out.println(tree1);
        System.out.println(tree2);
    }

    public void addToTreeSet() {
        tree2.addAll(tree1);
        showTreeSets();
    }

}
