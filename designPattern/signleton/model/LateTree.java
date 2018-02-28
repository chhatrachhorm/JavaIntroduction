package signleton.model;
/**
 * Late Instantiation
 * */
public class LateTree {
    private Integer treeID;
    /*
    * make a non initialized object static reference
    * this is called late instantiation
    * */
    private static LateTree lateTree;
    // make constructor private
    private LateTree(Integer treeID){
        this.treeID = treeID;
        System.out.println("LateTree class instantiation done");
    }

    public void printLateTreeID(){
        System.out.println("LateTree ID is " + lateTree.treeID);
    }

    /*
    * Go along with late instantiation
    * */
    public static synchronized LateTree getLateTree(){
        if(lateTree == null){
            lateTree = new LateTree(5000);
        }
        return lateTree;
    }

}
