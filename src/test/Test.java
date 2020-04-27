package test;


import gp.dip.JavaCourse;
import gp.dip.PythonCourse;
import gp.dip.Tom;

public class Test {
    public static void main(String[] args) {
        Tom tom=new Tom(new JavaCourse());
        Tom tom1=new Tom(new PythonCourse());
    }
}
