class Employee{
    String name;
    int id;
    Employee(){
        name = "Dipesh";
        id = 101;
    }

    void dis(){
        System.out.println("Name: "+name+" Eid: "+id);
    }
}

public class Default{
    public static void main(String[] args){
        Employee obj = new Employee();
        obj.dis();
    }
}