package proxy.datasource;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xxbb
 */
public class Client {
    public static void main(String[] args) throws ParseException {
        Order order=new Order();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        Date date=sdf.parse("2020/05/03");
        order.setCreateTime(date.getTime());

        IOrderSerivce orderService= (IOrderSerivce) new OrderServiceCglibProxy(new OrderService()).getInstance();
        orderService.createOrder(order);
    }
}
