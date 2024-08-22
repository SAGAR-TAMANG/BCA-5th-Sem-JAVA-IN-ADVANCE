// WAPJ to declare one boolean variable then with false initialization later converted to true, 
// then write if contruct where you pass this boolean veraible to print the statement
// you have successfully executed 0, 1 test.

class Program1 {
    boolean var1;
    Program1() {
        var1 = false;
    }

    public static void main(String[] args) {
        Program1 obj1 = new Program1();

        if (obj1.var1 == false) {
            obj1.var1 = true;
        }
        System.out.println("You have successfully exected 0, 1 Test");
    }
}
