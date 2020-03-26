package vjezbe2020.vjezba4;

public class Group  {

    protected String name;

    public Group(){
        this.name = "No group";
    }

    public Group(String name){
        this.name = name;
    }

    protected String getGroupName(){
        return this.name;
    }

}
