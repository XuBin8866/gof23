package adapter.login;

/**
 * @author xxbb
 */
public class LoginForTelAdapter  implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String key, Object adapter) {
        return null;
    }
}
