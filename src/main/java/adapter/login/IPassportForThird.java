package adapter.login;

/**
 * @author xxbb
 */
public interface IPassportForThird {
    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWeChat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelephone(String telephone, String code);

    ResultMsg loginForRegist(String username, String password);
}
