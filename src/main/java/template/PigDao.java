package template;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xxbb
 */
public class PigDao extends BaseDao{


    @Override
    int doUpdate(PreparedStatement preparedStatement) throws SQLException {
        System.out.println("代表进行修改猪只信息的预处理操作");
        System.out.println("执行修改"+preparedStatement.toString());
        return 0;
    }

    @Override
    Object doQuery(PreparedStatement preparedStatement) throws SQLException {
        System.out.println("代表进行猪只信息查询的预处理操作");
        System.out.println("执行查询"+preparedStatement.toString());
        return null;
    }
}
