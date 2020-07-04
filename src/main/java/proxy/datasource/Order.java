package proxy.datasource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author xxbb
 */

public class Order {
    private String id;
    private Object orderInfo;
    private Long createTime;

    public Order() {
    }

    public Order(String id, Object orderInfo, Long createTime) {
        this.id = id;
        this.orderInfo = orderInfo;
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}

