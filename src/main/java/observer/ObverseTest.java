package observer;

/**
 * @author xxbb
 */
public class ObverseTest {
    public static void main(String[] args) {
        KnowledgePlanet knowledgePlanet=KnowledgePlanet.getInstance();
        Teacher ma=new Teacher("ma");
        Teacher c=new Teacher("c");
        knowledgePlanet.addObserver(ma);
        knowledgePlanet.addObserver(c);

        //业务逻辑代码
        Question question=new Question();
        question.setUsername("hxd");
        question.setContent("观察者模式适用于哪些场景呢？");

        knowledgePlanet.publishQuestion(question);

    }
}
