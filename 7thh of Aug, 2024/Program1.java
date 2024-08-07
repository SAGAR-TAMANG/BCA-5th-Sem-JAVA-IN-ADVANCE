class Employee {
  String name;
  String designation;
  String address;
  
  void display() {
    System.out.println("Employee Info");
    System.out.println("Name" + name);
    System.out.println("Designation" + designation);
    System.out.println("Address" + address);
    System.out.println("\n\n");
  }
}

class Department extends Employee {
  int department_id;
  String name_of_dept;
  void display1() {
    System.out.println("Department ID");
    System.out.println("Department ID" + department_id);
    System.out.println("Name of Dept" + name_of_dept);
    System.out.println("\n\n");
  }
}

class Finance extends Department {
  int salary;
  int da;
  int allowance;
  int total_salary;
  
  void display2() {
    System.out.println("Finance Info");
    System.out.println("Salary" + salary);
    System.out.println("DA" + da);
    System.out.println("Allowance" + address);
    // System.out.println("Total Salary" + total_salary);
    System.out.println("\n\n");
  }
  
  void calculate_total () {
    int total_salary = salary + da + allowance;
  }
}

public class Program1 {
  public static void main(String[] args) {
    Finance obj1 = new Finance();
    
    obj1.name = "Upasana";
    obj1.designation = "Manager";
    obj1.address = "Ghy";
    obj1.department_id = 101;
    obj1.name_of_dept = "Finance";
    obj1.salary = 9999;
    obj1.da = 101;
    obj1.allowance = 101;
    
    obj1.display();
    obj1.display1();
    obj1.display2();
  }
}