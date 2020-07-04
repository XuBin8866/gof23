package proxy;

/**
 * @author xxbb
 */
public class User implements BuyTicket{
    /**
     * 购票
     */
    @Override
    public void buyTicket() {
        System.out.println("用户：请求购票");
    }

    public void offerInfo(){
        System.out.println("用户：提供购票需要的个人信息");
    }
}
