package chainofResponsibility.middleware;

/**
 * @author xubin
 * @date 2021/6/4 16:16
 */
public abstract class Middleware {
	private Middleware next;
	
	public Middleware linkWith(Middleware next){
		this.next=next;
		return next;
	}
	
	public abstract boolean check(String email,String password);
	
	protected boolean checkNext(String email,String password){
		if(next==null){
			return true;
		}
		return next.check(email,password);
	}
}
