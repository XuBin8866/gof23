package gp.carp;

/**
 * @author xxbb
 */
public class ProductDao {
    private BaseDbConnection dbConnection;

    public BaseDbConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(BaseDbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
    public void addProduct(){
        String conn=dbConnection.getConnection();
        System.out.println("使用"+conn+"增加了产品");
    }
}
