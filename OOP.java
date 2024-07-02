public class OOP {
    public static void main(String[] args) {
        
        /*Employee employee = new Employee();
        /Employee emlpoyee2 = employee;

        employee.id = 1;
        employee.name = "Kadir Senbulbul";
        employee.email = "kadir@example.com";

        System.out.println("Employee 1 name: " + employee.name);
        System.out.println("Employee 2 name: " + emlpoyee2.name);

        employee.showInfos(); //In Employee class we defined it */

        Employee newEmployee = new Employee(2, "Fethi", "fethi@example.com");
        Employee employee3 = new Employee();

        newEmployee.showInfos();
        employee3.showInfos();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.Add(newEmployee);


    }
}
