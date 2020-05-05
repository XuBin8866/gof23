package proxy;

/**
 * @author xxbb
 */
public class Client {
    public static void main(String[] args) {
        BuyTicketProxy buyTicketProxy=new BuyTicketProxy(new User());
        buyTicketProxy.buyTicket();
    }
}
