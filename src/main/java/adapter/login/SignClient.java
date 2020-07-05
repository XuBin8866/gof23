package adapter.login;

/**
 * @author xxbb
 */
public class SignClient {
    public static void main(String[] args) {
        SignForThirdService signForThirdService=new SignForThirdService();
        signForThirdService.loginForQQ("8997pdd");
    }
}
