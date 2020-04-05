package vjezbe2020.vjezba5;


import lombok.AllArgsConstructor;
import lombok.Getter;
import vjezbe2020.vjezba5.products.Product;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public class Branch {

    private Company company;
    private String branchName;
    private Location location;
    private Map<Product, Integer> products;

    public Branch(Company company, String branchName, Location location){
        this.company = company;
        this.branchName = branchName;
        this.location = location;
        this.products = new HashMap<>();
    }

    public void addProduct(Product product){
        if(!products.containsKey(product)){
            products.put(product, 1);
        } else {
            var currentAmount = products.get(product);
            currentAmount++;
            products.put(product, currentAmount);
        }
    }

    public void doStockTaking(){
        var prefix = new StringBuilder()
                .append(branchName)
                .append(Constants.STOCKTAKING_DISPLAY_SEPARATOR)
                .append(location)
                .toString();

        System.out.println(prefix);

        var sb = new StringBuilder();

        for(Product product: products.keySet()){
            int productAmount = products.get(product);
            var stockTakeDisplay = sb.append(product.getDescription())
                    .append(": ")
                    .append(productAmount)
                    .toString();
            System.out.println(stockTakeDisplay);

            sb.delete(0, sb.length());
        }
        System.out.println("----------------------------------------------");

    }

}
