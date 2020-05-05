package proxy.datasource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author xxbb
 */
@Getter
@Setter
@ToString
public class Order {
    private String id;
    private Object orderInfo;
    private Long createTime;

}

