package adapter.login;

/**
 * @author xxbb
 */
public class LoginForWeChatAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWeChatAdapter;
    }

    @Override
    public ResultMsg login(String key, Object adapter) {
        return null;
    }
}
