package chainofResponsibility.middleware;

/**
 * @author xubin
 * @date 2021/6/4 16:19
 */
public class ThrottlingMiddleware extends Middleware{
	private int requestPerMinute;
	private int request;
	private long currentTime;
	
	public ThrottlingMiddleware(int requestPerMinute){
		this.requestPerMinute=requestPerMinute;
		this.currentTime=System.currentTimeMillis();
	}
	
	@Override
	public boolean check(String email, String password) {
		if(System.currentTimeMillis()>currentTime+6000){
			request=0;
			currentTime=System.currentTimeMillis();
		}
		request++;
		if(request>requestPerMinute){
			System.out.println("Request limit exceeded");
			Thread.currentThread().stop();
		}
		return checkNext(email,password);
	}
}
