package vjezbe2020.vjezba5.products.packs;

import vjezbe2020.vjezba5.products.Product;
import lombok.Getter;

@Getter
public abstract class Pack extends Product {

    protected int packSize;

    public Pack(String name, String serialNumber, int packSize){
        super(name, serialNumber);
        this.packSize = packSize;
    }
}
