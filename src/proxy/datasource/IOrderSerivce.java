package proxy.datasource;

/**
 * @author xxbb
 */
public interface IOrderSerivce {
    /**
     * 创建Order
     * @param order order
     * @return int
     */
    public int createOrder(Order order);
}
