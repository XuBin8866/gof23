package factory;

/**
 * @author xxbb
 */
public class JavaCourse implements ICourse{
    /**
     * 录制课程视频
     */
    @Override
    public void record() {
        System.out.println("正在录制java课程视频");
    }
}
