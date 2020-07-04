package factory;

/**
 * @author xxbb
 */
public class PythonCourse  implements ICourse{
    /**
     * 录制课程视频
     */
    @Override
    public void record() {
        System.out.println("正在录制python视频");
    }
}
