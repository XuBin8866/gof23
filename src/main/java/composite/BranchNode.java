package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxbb
 */
public class BranchNode extends Node{
    List<Node> nodes=new ArrayList<>();
    String name;
    public BranchNode(String name){
        this.name=name;
    }
    @Override
    void p() {
        System.out.println(name);
    }

    @Override
    void treeify(int dept) {
        for(int i=0;i<dept;i++){
            System.out.print("--");
        }
        p();
        for(Node node:nodes){
            node.treeify(dept+1);
        }
    }

    public void add(Node n){
        nodes.add(n);
    }


}
