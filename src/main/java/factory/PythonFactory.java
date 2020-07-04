package factory;

/**
 * @author xxbb
 */
public  class PythonFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
