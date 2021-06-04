package commmad.commands;

import java.util.Stack;

/**
 * @author xubin
 * @date 2021/6/3 15:25
 */
public class CommandHistory {
	private Stack<Command> history = new Stack<>();
	
	public void push(Command c) {
		history.push(c);
	}
	
	public Command pop() {
		return history.pop();
	}
	
	public boolean isEmpty() { return history.isEmpty(); }
}
