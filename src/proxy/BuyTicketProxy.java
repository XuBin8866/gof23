package proxy;

/**
 * @author xxbb
 */
public class BuyTicketProxy implements BuyTicket{
    private User user;
    public BuyTicketProxy(User u){
        user=u;
    }
    /**
     * 购票
     */
    @Override
    public void buyTicket() {
        user.buyTicket();
        System.out.println("代理平台：请求获取用户信息");
        user.offerInfo();
        System.out.println("代理平台：购票完成！！！");
    }
}
