class A {
    int x;
    String b;       // Capital S for String
    boolean c;

    // Default constructor
    A() {
        x = 100;      // Use variable name x, not a
        b = "biltu";
        c = true;
    }

    void disp() {
        System.out.println(x + " " + b + " " + c);
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.disp();
    }
}
