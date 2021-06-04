package chainofResponsibility.server;

import chainofResponsibility.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xubin
 * @date 2021/6/4 16:39
 */
public class Server {
	private Map<String ,String> users=new HashMap<>();
	private Middleware middleware;
	
	public void setMiddleware(Middleware middleware){
		this.middleware=middleware;
	}
	
	public boolean login(String email,String password) {
		if (middleware.check(email, password)) {
			System.out.println("Authorization have been successful");
			return true;
		}
		return false;
	}
	
	public void register(String email,String password){
		users.put(email,password);
	}
	
	public boolean hasEmail(String email){
		return users.containsKey(email);
	}
	
	public boolean isValidPassword(String email,String password){
		return users.get(email).equals(password);
	}
}
