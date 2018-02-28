package signleton.model;
/**
* Early Instantiation
* */
public class EarlyTree {
    private Integer treeID;
    /*
    * make default static instance of the class
    * this is called early instantiation
    * */
    private static EarlyTree earlyTree = new EarlyTree(100);

    // make constructor private
    private EarlyTree(Integer treeID){
        this.treeID = treeID;
        System.out.println("EarlyTree class instantiation done");
    }

    public void printEarlyTreeID(){
        System.out.println("EarlyTree ID is " + earlyTree.treeID);
    }
    public static EarlyTree getEarlyTree(){
        return earlyTree;
    }
}
