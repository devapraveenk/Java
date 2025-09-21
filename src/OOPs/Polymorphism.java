package OOPs;

public class Polymorphism {
    public static void main(String[] args) {
        Chlid op = new Chlid();
        op.display();
        System.out.println(Parent.val);
        Parent.name();
        op.display(90); // polymorphism
    }

}

class Parent {
    static int val = 10;

    private void display() {
        System.out.println(val);
    }

    void display1() {
        System.out.println(val);
    }

    void display(int val) {
        System.out.println(val);
    }

    static void name() {
        System.out.println("hello");
    }
}

class Chlid extends Parent {
    int val = 89;

    void display() {
        System.out.println(val);
    }
}