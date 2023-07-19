public class test{
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe",40,123,50000,"IT");
        Programmer progammer = new Programmer("Jane Smith",30,456,40000,"Java");
        Security security = new Security("Adam Jones",45,789,18000,"Night");

        manager.DisplayDetails();
        manager.Work();
        manager.CallMeeting();

        progammer.DisplayDetails();
        progammer.Work();
        progammer.Coding();

        security.DisplayDetails();
        security.Work();
        security.Patrol();
    }
}

class Employee{
    public int Emp_ID;
    public String Name;
    public int Age;
    public int Salary;

    Employee(String name, int age, int emp_id, int salary){
        this.Name = name;
        this.Age = age;
        this.Emp_ID = emp_id;
        this.Salary = salary;
    }

    public void Work(){
        System.out.println(Name + " is Working.");
    }
    public void DisplayDetails(){
        System.out.println("Name: " + Name);
        System.out.println("Age: " +Age);
        System.out.println("Employee ID: " +Emp_ID);
        System.out.println("Salary: " +Salary);
    }

}

class Manager extends Employee{
    public String Department;
    
    Manager(String name, int age, int emp_id, int salary, String department){
        super(name,age,emp_id,salary);
        Department = department;
    }

    public void CallMeeting(){
        System.out.println(this.Name + " is scheduling a meeting.");
        System.out.println("........................................");
    }
    
}

class Programmer extends Employee{
    public String Language;
    
    Programmer(String name, int age, int emp_id, int salary, String language){
        super(name,age,emp_id,salary);
        Language = language;
    }

    public void Coding(){
        System.out.println(this.Name + " is coding.");
        System.out.println("........................................");
    }
    
}

class Security extends Employee{
    public String Shift;

    Security(String name, int age, int emp_id, int salary, String shift){
        super(name,age,emp_id,salary);
        Shift = shift;
    }

    public void Work(){
        System.out.println("Availiable at "+ Shift +" Shift");
    }

    public void Patrol(){
        System.out.println(this.Name + " is Patrolling");
        System.out.println("........................................");
    }
}
