package delegate;

/**
 * @author xxbb
 */
public class Boss {
    public void command(String command,Leader leader){
        leader.working(command);
    }
}
