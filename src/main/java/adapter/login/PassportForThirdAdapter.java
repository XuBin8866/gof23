package adapter.login;

/**
 * @author xxbb
 */
public class PassportForThirdAdapter  extends SignService implements IPassportForThird{
    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> loginAdapterClazz){
        try {
            LoginAdapter adapter=loginAdapterClazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }else{
                return null;
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWeChat(String openId) {
        return processLogin(openId,LoginForWeChatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token,LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelephone(String telephone, String code) {
        return processLogin(telephone,LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String password) {
        regist(username,password);
        return login(username,password);
    }
}
