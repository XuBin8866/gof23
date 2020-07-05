package observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Queue;

/**
 * @author xxbb
 */
public class Teacher implements Observer {
    private String name;
    public Teacher(String name){
        this.name=name;
    }

    @Override
    public void update(Observable o, Object arg){
        KnowledgePlanet knowledgePlanet= (KnowledgePlanet) o;
        Question question= (Question) arg;
        System.out.println("===============================");
        System.out.println(name+"老师您好，您收到一个来自"+ knowledgePlanet.getName()+"的提问" +
                "，希望您能解答。问题内容如下"+question.getContent()+",提问者："+question.getUsername());

    }
}
