package vjezbe2020.vjezba5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import vjezbe2020.vjezba5.products.Product;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Company {

    private String companyName;
    private Group group;
    private List<Branch> branches;

    public Company(String companyName, Group group){
        this.companyName = companyName;
        this.group = group;
        this.branches = new ArrayList<>();
    }

    public void addBranch(Branch branch){
        branches.add(branch);
    }

    public void closeBranch(Branch closedBranch, Branch branch){
        moveProducts(closedBranch, branch);
        branches.remove(closedBranch);
    }

    private void moveProducts(Branch closedBranch, Branch branch){

        var closingPrefix = new StringBuilder()
                .append("Stanje skladišta u zatvorenoj poslovnici")
                .append(Constants.STOCKTAKING_DISPLAY_SEPARATOR)
                .append(closedBranch.getBranchName())
                .toString();

        System.out.println(closingPrefix);

        closedBranch.doStockTaking();

        for( Product closedBranchProduct: closedBranch.getProducts().keySet() ){
            for( Product product: branch.getProducts().keySet() ){
                if( closedBranchProduct.equals(product) ) {
                    var closedCurrentAmount = closedBranch.getProducts().get(closedBranchProduct);
                    var currentAmount = branch.getProducts().get(closedBranchProduct);
                    var total = closedCurrentAmount + currentAmount;
                    branch.getProducts().put(closedBranchProduct, total);
                }
            }
            if( !branch.getProducts().containsKey(closedBranchProduct) ){
                branch.getProducts().put(closedBranchProduct, closedBranch.getProducts().get(closedBranchProduct));
            }
        }

        var newProductsPrefix = new StringBuilder()
                .append("Novo stanje skladišta poslovnice")
                .append(Constants.STOCKTAKING_DISPLAY_SEPARATOR)
                .append(branch.getBranchName())
                .toString();
        System.out.println(newProductsPrefix);
        branch.doStockTaking();

    }

    public void doStockTaking(String groupPrefix){
        for(Branch branch: branches){
            var companyPrefix = new StringBuilder()
                    .append(companyName)
                    .append(Constants.STOCKTAKING_DISPLAY_SEPARATOR)
                    .toString();
            System.out.println(groupPrefix);
            System.out.println(companyPrefix);
            branch.doStockTaking();
        }
    }

}
