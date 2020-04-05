package vjezbe2020.vjezba5.products.packs;

public class SafetyMaskPack extends Pack {

    public SafetyMaskPack(String name, String serialNumber, int packSize){
        super(name, serialNumber, packSize);
    }

    @Override
    public String getDescription(){
        return new StringBuilder()
                .append(getFullProductName())
                .append(" size ")
                .append(packSize)
                .toString();
    }

}
