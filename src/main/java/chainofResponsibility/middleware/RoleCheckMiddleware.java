package chainofResponsibility.middleware;

/**
 * @author xubin
 * @date 2021/6/4 16:46
 */
public class RoleCheckMiddleware extends Middleware {
	private static final String ADMIN="admin@example.com";
	
	@Override
	public boolean check(String email, String password) {
		if(email.equals(ADMIN)){
			System.out.println("Hello,admin!!!");
			return true;
		}
		System.out.println("Hello ,user!");
		return checkNext(email, password);
	}
}
