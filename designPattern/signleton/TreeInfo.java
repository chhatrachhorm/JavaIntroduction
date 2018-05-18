package signleton;

import signleton.enumerator.EnumTree;
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


        //===========================================================//

        /*
        * Late Instantiation with Synchronized Keyword Function
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

        /*
        * Late Instantiation with Synchronized Code Block
        * */
        Thread k3 = new Thread(()->{
            LateTree lateTree = LateTree.getLateTreeInstance();
            lateTree.printLateTreeID();
        });
        Thread k4 = new Thread(()->{
            LateTree lateTree = LateTree.getLateTreeInstance();
            lateTree.printLateTreeID();
        });
        k3.start();
        k4.start();

        /*
        * Singleton with Enumerator
        * */
        EnumTree enumTree = EnumTree.INSTANCE;
        enumTree.setTreeName("Pine Tree");
        enumTree.printEnumTree();
    }
}
