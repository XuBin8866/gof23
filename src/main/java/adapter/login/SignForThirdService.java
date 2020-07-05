package adapter.login;

import javax.xml.transform.Result;

/**
 * @author xxbb
 */
public class SignForThirdService extends SignService{

    public ResultMsg loginForQQ(String openId){
        //1.openId全局唯一，可以把他当作一个用户名
        //2.密码默认为QQ_EMPTY
        //3.注册
        //4.调用原来的登录方法
        return regist(openId,null);
    }

    public ResultMsg loginForWeChat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String token){
        //通过Token获取用户信息，然后重新登录一次
        return null;
    }
    public ResultMsg loginForTelephone(String telephone,String code){
        return null;
    }

    public ResultMsg loginForRegist(String username,String password){
        regist(username,null);
        return login(username,null);
    }

}
