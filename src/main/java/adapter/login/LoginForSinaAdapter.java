package adapter.login;

/**
 * @author xxbb
 */
public class LoginForSinaAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String key, Object adapter) {
        return null;
    }
}
