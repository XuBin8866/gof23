package factory;

/**
 * @author xxbb
 */
public class JavaFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
