package composite;

/**
 * @author xxbb
 */
public class TestMain {
    public static void main(String[] args) {
        BranchNode branchNode=new BranchNode("root");
        BranchNode file1=new BranchNode("file1");
        BranchNode file2=new BranchNode("file2");
        LeafNode leafNode1=new LeafNode("leaf1");
        LeafNode leafNode2=new LeafNode("leaf2");
        LeafNode leafNode3=new LeafNode("leaf3");
        branchNode.add(leafNode1);
        branchNode.add(file1);
        branchNode.add(file2);
        file2.add(leafNode2);
        file2.add(leafNode3);

        branchNode.treeify(0);
    }
}
