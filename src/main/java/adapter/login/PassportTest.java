package adapter.login;

/**
 * @author xxbb
 */
public class PassportTest {
    public static void main(String[] args) {
        IPassportForThird passportForThird=new PassportForThirdAdapter();
        passportForThird.loginForQQ("ssd2222");
    }
}
