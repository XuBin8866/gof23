package template;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xxbb
 */
public class LogDao extends AbstractDao{
   public Object doErrorQuery(String sql) throws SQLException {
       return execute(sql, new DaoCallback() {
           @Override
           public Object doQuery(PreparedStatement preparedStatement) {
               System.out.println("代表进行错误日志查询的预处理");
               System.out.println("执行错误日志查询"+preparedStatement.toString());
               return null;
           }
       });
   }
    public Object doLoginQuery(String sql) throws SQLException {
        return execute(sql, new DaoCallback() {
            @Override
            public Object doQuery(PreparedStatement preparedStatement) {
                System.out.println("代表进行登录日志查询的预处理");
                System.out.println("执行登录日志查询"+preparedStatement.toString());
                return null;
            }
        });
    }
    public Object doLoginUpdate(String sql) throws  SQLException{
       return execute(sql, new DaoCallback() {
           @Override
           public Object doUpdate(PreparedStatement preparedStatement) {
               System.out.println("代表进行登录日志修改的预处理");
               System.out.println("修改登录日志"+preparedStatement.toString());
               return null;
           }

           @Override
           public boolean isUpdate() {
               return true;
           }
       });
    }
}
