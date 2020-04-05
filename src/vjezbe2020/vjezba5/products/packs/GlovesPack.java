package vjezbe2020.vjezba5.products.packs;

import lombok.Getter;

@Getter
public class GlovesPack extends Pack {

    private String color;

    public GlovesPack(String name, String serialNumber, int packSize, String color){
        super(name, serialNumber, packSize);
        this.color = color;
    }

    @Override
    public String getDescription(){
        return new StringBuilder()
                .append(getFullProductName())
                .append(" ")
                .append(color)
                .append(" color, pack size ")
                .append(packSize)
                .toString();
    }

}
