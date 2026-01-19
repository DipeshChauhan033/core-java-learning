package student1;

public class Data{
    String name;
    int eno;

    public Data(String name, int eno){
        this.name=name;
        this.eno=eno;
    }

    public void dis(){
        System.out.printf("student name is \"%s\" and eno is- %d",name,eno);
    }
}

