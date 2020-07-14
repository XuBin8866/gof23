package composite;

/**
 * @author xxbb
 */
public class LeafNode extends Node{
    String content;
    public LeafNode(String content){
        this.content=content;
    }
    @Override
    void p() {
        System.out.println(content);
    }

    @Override
    void treeify(int dept) {
        for(int i=0;i<dept;i++){
            System.out.print("--");
        }
        p();
    }
}
