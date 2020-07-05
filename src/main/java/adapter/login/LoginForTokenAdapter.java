package adapter.login;

/**
 * @author xxbb
 */
public class LoginForTokenAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String key, Object adapter) {
        return null;
    }
}
