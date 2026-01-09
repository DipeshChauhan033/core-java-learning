class Employee{
    String name;
    int id;
    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    void dis(){
        System.out.println("Name: "+this.name+" Eid: "+this.id);
    }
}

public class parameterized{
    public static void main(String[] args){
        Employee obj = new Employee("Dipesh",101);
        obj.dis();
    }
}