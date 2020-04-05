package vjezbe2020.vjezba5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Location {

    private String name;

    @Override
    public String toString(){
        return name;
    }

}
