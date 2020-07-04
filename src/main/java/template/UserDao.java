package template;

import javax.servlet.http.HttpServlet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xxbb
 */
public class UserDao extends BaseDao{
    @Override
    int doUpdate(PreparedStatement preparedStatement) throws SQLException {
        System.out.println("代表进行修改用户信息的预处理操作");
        System.out.println("执行修改"+preparedStatement.toString());
        return 0;
    }

    @Override
    Object doQuery(PreparedStatement preparedStatement) throws SQLException {
        System.out.println("代表进行用户信息查询的预处理操作");
        System.out.println("执行查询"+preparedStatement.toString());
        return null;
    }
}
