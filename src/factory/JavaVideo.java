package factory;

/**
 * @author xxbb
 */
public class JavaVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("java录播视频");
    }
}
