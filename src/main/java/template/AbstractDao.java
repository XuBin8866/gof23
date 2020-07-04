package template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xxbb
 */
public abstract class AbstractDao {
    private static final String DRIVER="com.mysql.cj.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/db_orm?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf-8&";
    private static final String USERNAME="root";
    private static final String PASSWORD="123456";
    protected boolean ifUpdate=false;
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    public Object execute(String sql,DaoCallback daoCallback) throws SQLException {
        //数据库操作都需要的准备工作，公共操作部分
        Connection connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        //可能存在差异的部分
        if(daoCallback.isUpdate()){
            return daoCallback.doUpdate(preparedStatement);
        }else{
            return daoCallback.doQuery(preparedStatement);
        }
    }


}
