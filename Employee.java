public class Employee {
// Attribute, Field
    public int id;   // we use public so we can acces this attributes in other classes
    public String name;
    public String email;

    public Employee(int id,String name, String email){ //constructor
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public Employee(){
        this.id= 0;
        this.name = "No info";
        this.email = "No info";
    }

    public void showInfos(){
        System.out.println("Name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("Email: " + this.email);
    }
}
