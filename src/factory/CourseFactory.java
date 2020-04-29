package factory;

import java.util.Calendar;

/**
 * @author xxbb
 */
public class CourseFactory {
    public static ICourse getCourse(Class<? extends ICourse> clazz){
        if(null!=clazz){
            try {
                return clazz.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
       return null;
    }

    public static void main(String[] args) {
    }
}
