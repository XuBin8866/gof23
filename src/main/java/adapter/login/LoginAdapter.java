package adapter.login;

/**
 * @author xxbb
 */
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String key, Object adapter);
}
