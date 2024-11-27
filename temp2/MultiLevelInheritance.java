class Employee {
  int id;
  String name;

  public void setEmployee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void displayEmployee() {
    System.out.println("Employee Name:" + this.name);
    System.out.println("Employee ID:" + this.id);
  }
}

class Account extends Employee {
  String accountNumber;

  public void setAccount(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void displayAccount() {
    System.out.println("Account Number: " + this.accountNumber);
  }
}

class Salary extends Account {
  double basicPay, deductions;

  public void setSalaryDetails(double basicPay, double deductions) {
    this.basicPay = basicPay;
    this.deductions = deductions;
  }

  public double calculateNetSalary() {
    return basicPay - deductions;
  }

  public void displaySalary() {
    System.out.println("Basic Pay: " + basicPay);
    System.out.println("Deductions: " + deductions);
    System.out.println("Net Salary: " + calculateNetSalary());
  }
}

class MultiLevelInheritance {
  public static void main(String[] args) {
    Salary emp = new Salary();

    emp.setEmployee(101, "Sagar Tamang");
    emp.setAccount("ACC101");
    emp.setSalaryDetails(50000, 5000);

    emp.displayEmployee();
    emp.displayAccount();
    emp.displaySalary();
  }
}