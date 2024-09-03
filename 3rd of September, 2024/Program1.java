import java.util.Scanner;

class Company {
  double sal;
  double da;

  Scanner scn = new Scanner(System.in);
  
  double get_salary() {
    return 0;
  }
  
  double get_da() {
    return 0;
  }
}

class HR extends Company {  
  HR() {
    System.out.println("Please give the Salary of HR: ");
    sal = scn.nextDouble();
    System.out.println("Please give the DA of HR: ");
    da = scn.nextDouble();
  }
  
  double get_salary() {
    return sal;
  }

  double get_da() {
    return da;
  }
}

class Management extends Company {
  Management() {
    System.out.println("Please give the Salary of Management: ");
    sal = scn.nextDouble();
    System.out.println("Please give the DA of Management: ");
    da = scn.nextDouble();
  }
  
  double get_salary() {
    return sal;
  }

  double get_da() {
    return da;
  }
}

class Finance extends Company {
  Finance() {
    System.out.println("Please give the Salary of Finance: ");
    sal = scn.nextDouble();
    System.out.println("Please give the DA of Finance: ");
    da = scn.nextDouble();
  }
  
  double get_salary() {
    return sal;
  }

  double get_da() {
    return da;
  }
}

class Office extends Company {
  Office() {
    System.out.println("Please give the Salary of Office: ");
    sal = scn.nextDouble();
    System.out.println("Please give the DA of Office: ");
    da = scn.nextDouble();
  }
  
  double get_salary() {
    return sal;
  }

  double get_da() {
    return da;
  }
}

class Program1 {
  public static void main(String[] args) {
    HR obj1 = new HR();
    Management obj2 = new Management();
    Finance obj3 = new Finance();
    Office obj4 = new Office();

    System.out.println("\n $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ \n: ");
    
    System.out.println("Salary of HR: " + obj1.get_salary());
    System.out.println("DA of HR: " + obj1.get_da());
    
    System.out.println("Salary of Management: " + obj2.get_salary());
    System.out.println("DA of Management: " + obj2.get_da());
    
    System.out.println("Salary of Finance: " + obj3.get_salary());
    System.out.println("DA of Finance: " + obj3.get_da());
    
    System.out.println("Salary of Office: " + obj4.get_salary());
    System.out.println("DA of Office: " + obj4.get_da());
  }
}