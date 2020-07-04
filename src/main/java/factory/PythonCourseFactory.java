package factory;

/**
 * @author xxbb
 */
public class PythonCourseFactory implements MyCourseFactory{
    @Override
    public IVideo createVideo() {
        return new PythonVide();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }
}
