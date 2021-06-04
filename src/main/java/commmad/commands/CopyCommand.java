package commmad.commands;

import commmad.edit.Editor;

/**
 * @author xubin
 * @date 2021/6/3 15:16
 */
public class CopyCommand extends Command{
	public CopyCommand(Editor editor) {
		super(editor);
	}
	
	@Override
	public boolean execute() {
		editor.clipboard = editor.textField.getSelectedText();
		return false;
	}
}
