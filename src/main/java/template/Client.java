package template;

import java.sql.SQLException;
import java.util.AbstractList;

/**
 * @author xxbb
 */
public class Client {
    public static void main(String[] args) throws SQLException {
        BaseDao dao=new PigDao();
        String sql="这是一条查询猪只语句";
        String sql2="这是一条猪只DML语句";
        //执行查询操作
        dao.execute(sql);
        //执行增删改操作
        dao.isIfUpdate(true);
        dao.execute(sql2);
        System.out.println("==============================");
        BaseDao userDao=new UserDao();
        String sql3="这是一条User查询语句";
        String sql4="这是一条UserDML语句";
        //执行查询操作
        userDao.execute(sql3);
        //执行增删改操作
        userDao.isIfUpdate(true);
        userDao.execute(sql4);


    }
}
