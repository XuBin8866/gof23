package gp.srp;

/**
 * @author xxbb
 */
public class ReplayCourse implements Course{
    @Override
    public void study(String courseName) {
        System.out.println(courseName+"录播课可以反复观看");
    }
}
