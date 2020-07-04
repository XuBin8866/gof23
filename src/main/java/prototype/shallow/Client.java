package prototype.shallow;

/**
 * @author xxbb
 */
public class Client {
    public Object startClone(ConcretePrototypeA concretePrototype){
        try {
            return concretePrototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
