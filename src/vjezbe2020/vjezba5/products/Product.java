package vjezbe2020.vjezba5.products;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public abstract class Product {

    protected String name;
    protected String serialNumber;

    public abstract String getDescription();

    public String getFullProductName(){
        return new StringBuilder()
                .append("(")
                .append(getSerialNumber())
                .append(") ")
                .append(getName())
                .toString();
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(serialNumber, product.serialNumber);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, serialNumber);
    }

}
