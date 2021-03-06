package proxy.datasource;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xxbb
 */

public class OrderServiceStaticProxy implements IOrderSerivce{
    private IOrderSerivce orderService;

    private SimpleDateFormat yearFormat=new SimpleDateFormat("yyyy");

    public OrderServiceStaticProxy(IOrderSerivce orderService){
        this.orderService=orderService;
    }
    /**
     * 创建Order
     *
     * @param order order
     * @return int
     */
    @Override
    public int createOrder(Order order) {
        System.out.println("Proxy before method");
        Long time=order.getCreateTime();
        int dbRouter= Integer.parseInt(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到DB_"+dbRouter+"数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
        int res=orderService.createOrder(order);
        System.out.println("Proxy after method");
        return res;
    }

    public OrderServiceStaticProxy(IOrderSerivce orderService, SimpleDateFormat yearFormat) {
        this.orderService = orderService;
        this.yearFormat = yearFormat;
    }

    public IOrderSerivce getOrderService() {
        return orderService;
    }

    public void setOrderService(IOrderSerivce orderService) {
        this.orderService = orderService;
    }

    public SimpleDateFormat getYearFormat() {
        return yearFormat;
    }

    public void setYearFormat(SimpleDateFormat yearFormat) {
        this.yearFormat = yearFormat;
    }
}
