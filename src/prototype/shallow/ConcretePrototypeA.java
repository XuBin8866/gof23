package prototype.shallow;

import java.io.*;
import java.util.List;

/**
 * @author xxbb
 */
public class ConcretePrototypeA implements Cloneable,Serializable{
    private Integer id;
    private String name;
    private List  hobby;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobby() {
        return hobby;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby=" + hobby +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //    @Override
//    public Prototype clone() {
//        try {
//            ByteArrayOutputStream bos=new ByteArrayOutputStream();
//            ObjectOutputStream oos=new ObjectOutputStream(bos);
//            oos.writeObject(this);
//
//            ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
//            ObjectInputStream ois=new ObjectInputStream(bis);
//            return (Prototype)ois.readObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}
