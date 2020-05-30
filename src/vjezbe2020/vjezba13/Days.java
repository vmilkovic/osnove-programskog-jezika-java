package vjezbe2020.vjezba13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Days {

    private List<String> days = new ArrayList(
            Arrays.asList("Ponedjeljak", "Utorak", "Srijeda", "Četvrtak", "Petak", "Subota", "Nedjelja"));

    public List<String> endsWith(String letter){
        return days.stream().filter(day -> day.endsWith(letter)).collect(Collectors.toList());
    }

    public List<String> firstThreeLetters(){
        return days.stream().map(day -> day.substring(0, 3)).collect(Collectors.toList());
    }

    public boolean hasLength(Integer length){
        return days.stream().anyMatch(days -> days.length() > length);
    }

}
