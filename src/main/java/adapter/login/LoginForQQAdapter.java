package adapter.login;

/**
 * @author xxbb
 */
public class LoginForQQAdapter implements LoginAdapter{

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String key, Object adapter) {
        return null;
    }
}
