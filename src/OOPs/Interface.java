package OOPs;
interface TicketBooking{
    void username();
    private void id(){
        int id_number = 10;
    }
    void orderid();
}

class MainAdmin implements TicketBooking{
    public void username(){
        System.out.println("H;ello Admin");
    }
    void id(){
        int id_number;
        id_number = 20;
        System.out.println(id_number);
    }
    public void orderid(){
        System.out.println("New Value");
    }
}
public class Interface {
    public static void main(String[] args) {
        MainAdmin ma = new MainAdmin();
        ma.username();
        ma.id();
        ma.orderid();
    }
}
