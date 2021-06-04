package chainofResponsibility.middleware;


import chainofResponsibility.server.Server;

/**
 * @author xubin
 * @date 2021/6/4 16:38
 */
public class UserExistsMiddleware extends Middleware{
	
	private Server server;
	
	public UserExistsMiddleware(Server server){
		this.server=server;
	}
	
	@Override
	public boolean check(String email, String password) {
		if(!server.hasEmail(email)){
			System.out.println("This email is not register");
			return false;
		}
		if(!server.isValidPassword(email, password)){
			System.out.println("Wrong password");
			return false;
		}
		return checkNext(email,password);
	}
}
