package vjezbe2020.vjezba5;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Group {

    private String name;
    private List<Company> companies;

    public Group(String name){
        this.name = name;
        this.companies = new ArrayList<>();
    }

    public void addCompany(Company company){
        companies.add(company);
    }

    public void doStockTaking(){
        var prefix = new StringBuilder()
                .append(name)
                .append(Constants.STOCKTAKING_DISPLAY_SEPARATOR)
                .toString();

        for(Company company: companies){
            company.doStockTaking(prefix);
            System.out.println();
        }
    }

}
