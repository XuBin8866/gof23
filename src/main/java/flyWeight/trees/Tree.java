package flyWeight.trees;

import java.awt.*;
/**
 * @author xubin
 * @date 2021/6/4 15:33
 */
public class Tree {
	private int x;
	private int y;
	private TreeType type;
	
	public Tree(int x, int y, TreeType type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public void draw(Graphics g) {
		type.draw(g, x, y);
	}
}
