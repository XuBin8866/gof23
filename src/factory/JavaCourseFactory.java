package factory;

/**
 * @author xxbb
 */
public class JavaCourseFactory implements MyCourseFactory{
    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }
}
