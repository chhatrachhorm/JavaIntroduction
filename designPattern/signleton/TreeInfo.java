package signleton;

import signleton.model.EarlyTree;
import signleton.model.LateTree;

public class TreeInfo {
    public static void main(String[] args) {
        /*
         * Early Instantiation
         * EarlyTree object cannot be created outside the class
         * EarlyTree kit = new EarlyTree(100);
         * */
        EarlyTree earlyTree  = EarlyTree.getEarlyTree();
        earlyTree.printEarlyTreeID();


        /*
        * Late Instantiation
        * Create multiple threads
        * */
        Thread k1 = new Thread(() -> {
            LateTree lateTree = LateTree.getLateTree();
            lateTree.printLateTreeID();
        });
        Thread k2 = new Thread(() -> {
            LateTree lateTree = LateTree.getLateTree();
            lateTree.printLateTreeID();
        });
        k1.start();
        k2.start();
    }
}
