package chainofResponsibility;

import chainofResponsibility.middleware.Middleware;
import chainofResponsibility.middleware.RoleCheckMiddleware;
import chainofResponsibility.middleware.ThrottlingMiddleware;
import chainofResponsibility.middleware.UserExistsMiddleware;
import chainofResponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xubin
 * @date 2021/6/4 16:49
 */
public class Demo {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Server server;
	
	public static void init(){
		server=new Server();
		server.register("admin@example.com","123456");
		server.register("xxbb@8866.com","123456");
		
		Middleware middleware=new ThrottlingMiddleware(2);
		middleware.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddleware());
		server.setMiddleware(middleware);
		
	}
	
	public static void main(String[] args) throws IOException {
		init();
		boolean success;
		do{
			System.out.println("Enter email:");
			String email= reader.readLine();
			System.out.println("Input password:");
			String password= reader.readLine();
			success=server.login(email,password);
		}while(!success);
	}
	
}
