package vjezbe2020.vjezba4;

public class Company extends Group {

    private String name;
    private Group group;

    Company(){
        name = "No company";
    }

    Company(String name){
        super();
        this.name = name;
    }

    Company(String name, Group group){
        this.name = name;
        this.group = group;
    }

    public String getCompanyName(){
        return this.name;
    }

    public String getGroupName(){
        return this.group.getGroupName();
    }

}
