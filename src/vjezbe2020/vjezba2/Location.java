package vjezbe2020.vjezba2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    private String name;

    @Override
    public String toString(){
        return name;
    }

}
