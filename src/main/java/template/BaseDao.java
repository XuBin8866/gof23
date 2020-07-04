package template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xxbb
 */
public  abstract class BaseDao {
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

    public Object execute(String sql) throws SQLException {
        //数据库操作都需要的准备工作，公共操作部分
        Connection connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        //可能存在诧异的部分
        if(isUpdate()){
            return doUpdate(preparedStatement);
        }else{
            return doQuery(preparedStatement);
        }
    }


    /**
     * 执行增删改操作
     * @return 受影响的行数
     */
    abstract int doUpdate(PreparedStatement preparedStatement) throws SQLException;

    /**
     * 执行查询操作
     * @return 结果集
     */
    abstract Object doQuery(PreparedStatement preparedStatement) throws SQLException;

    /**
     * 钩子方法 是否为增删改操作
     * @return default false
     */
    protected boolean isUpdate(){
        return ifUpdate;
    }
    public void isIfUpdate(boolean ifUpdate){
        this.ifUpdate=ifUpdate;
    }
}
