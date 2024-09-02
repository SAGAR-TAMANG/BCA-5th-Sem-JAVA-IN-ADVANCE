class Bank {
  int getInterest() {
    return 0;
  }
}

class SBI extends Bank {
  int getInterest() {
    return 8;
  }
}

class ICIC extends Bank {
  int getInterest() {
    return 7;
  }
}

class Axis extends Bank {
  int getInterest() {
    return 9;
  }
}

class Program1 {
  public static void main(String[] args) {
    SBI s = new SBI();
    ICIC s1 = new ICIC();
    Axis s2 = new Axis();

    System.out.println("Interest of SBI: " + s.getInterest());
    System.out.println("Interest of ICIC: " + s1.getInterest());
    System.out.println("Interest of AXIS: " + s2.getInterest());
  }
}