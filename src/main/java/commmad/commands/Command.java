package commmad.commands;

import commmad.edit.Editor;

/**
 * @author xubin
 * @date 2021/6/3 14:53
 */
public abstract class Command {
	public Editor editor;
	private String backup;
	
	Command(Editor editor) {
		this.editor = editor;
	}
	
	void backup() {
		backup = editor.textField.getText();
	}
	
	public void undo() {
		editor.textField.setText(backup);
	}
	
	public abstract boolean execute();
}
