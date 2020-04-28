package gp.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxbb
 */
public class TeamLeader {
    public void checkNums(){
        List<Course> courses=new ArrayList<>(5);
        for(int i=0;i<20;i++){
            courses.add(new Course());
        }
        System.out.println("number:"+courses.size());
    }
}
