package vjezbe2020.vjezba4;

public class Company extends Group {

    private String name;

    Company(){
        name = "No company";
    }

    Company(String name){
        super();
        this.name = name;
    }

    Company(String name, String group){
        super(group);
        this.name = name;
    }

    public String getCompanyName(){
        return this.name;
    }

}
