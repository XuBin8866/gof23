package gp.dip;

/**
 * @author xxbb
 */
public class Tom {
    private ICourse course;
    public Tom(ICourse course){
        this.course=course;
    }
    public void study(){
        course.study();
    }



    public void studyJava(){
        System.out.println("Tom在学习java");
    }
    public void studyPython(){
        System.out.println("Tom在学习python");
    }
}
