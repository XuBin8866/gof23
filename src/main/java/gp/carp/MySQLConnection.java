package gp.carp;

/**
 * @author xxbb
 */
public class MySQLConnection extends BaseDbConnection{
    @Override
    public String getConnection() {
        return "mysql";
    }
}
