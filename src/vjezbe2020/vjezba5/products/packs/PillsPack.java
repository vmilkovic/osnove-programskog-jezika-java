package vjezbe2020.vjezba5.products.packs;

public class PillsPack extends Pack {

    public PillsPack(String name, String serialNumber, int packSize){
        super(name, serialNumber, packSize);
    }

    @Override
    public String getDescription(){
        return getFullProductName();
    }

}
