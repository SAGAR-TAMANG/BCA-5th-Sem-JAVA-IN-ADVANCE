class Employee {
  int id;
  String name;
}

class Account extends Employee {
  String accountNumber;
}

class Salary extends Account {
  double pay;
}

class MultiLevelInheritanceShorter {
  public static void main(String[] args) {
      Salary emp = new Salary();

      emp.id = 101;
      emp.name = "Upasana";
      emp.accountNumber = "ACC12345";
      emp.pay = 9999;

      System.out.println("ID: " + emp.id);
      System.out.println("Name: " + emp.name);
      System.out.println("Account Number: " + emp.accountNumber);
      System.out.println("Pay: " + emp.pay);
  }
}
