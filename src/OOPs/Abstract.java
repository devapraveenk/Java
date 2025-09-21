package OOPs;
class Computer{
    void print(){
        System.out.println("Hello");
    }
    void welcome(){
         System.out.println("Welcome");
     }
}

class HP extends Computer{
    void print(){
        System.out.println("hello HP");
    }
    void welcome(){
        System.out.println("Welcome to HP");
    }
}
class DELL extends Computer{
    void welcome(){
        System.out.println("Welcome to DELL");

    }
    DELL(int a){
        System.out.println("THIS IS WORKOING");
        System.out.println(a);
    }
    void print(){
        System.out.println("This IS DELL");
    }

}
public class Abstract {
    public static void main(String[] args) {
            HP hp = new HP();
            DELL dell = new DELL(10);
            Computer cp = new DELL(10);
            hp.print();
            dell.print();
            cp.welcome();
            hp.welcome();
            cp.print();


    }
}
