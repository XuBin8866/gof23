package gp.srp;

/**
 * @author xxbb
 */
public class LiveCourse implements Course{
    @Override
    public void study(String courseName) {
        System.out.println(courseName+"直播课不可快进");
    }
}
