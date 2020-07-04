package proxy.datasource;

/**
 * @author xxbb
 */
public class OrderDao {
    public int insert(Order order) {
        System.out.println("OrderDao 创建Order成功");
        return 1;
    }
}
