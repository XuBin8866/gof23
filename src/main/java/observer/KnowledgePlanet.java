package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xxbb
 */
public class KnowledgePlanet extends Observable {
    private String name="知识星球";


    private KnowledgePlanet(){

    }
    /**
     * 枚举单例
     */
    private enum Holder{
        /**
         * 枚举单例对象
         */
        INSTANCE;
        private KnowledgePlanet knowledgePlanet;
        Holder(){
            knowledgePlanet=new KnowledgePlanet();
        }
    }
    public static  KnowledgePlanet getInstance(){
        return Holder.INSTANCE.knowledgePlanet;
    }

    public String getName(){
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUsername()+"提出了问题："+question.getContent());
        setChanged();
        notifyObservers(question);
    }
}
