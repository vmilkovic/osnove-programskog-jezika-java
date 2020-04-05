package vjezbe2020.vjezba5.products;

import lombok.Getter;

@Getter
public class Material extends Product {

    public Material(String name, String serialNumber){
        super(name, serialNumber);
    }

    @Override
    public String getDescription(){
        return getFullProductName();
    }

}
