
public class Main2 {


    public static void main(String[] args) {

        //1. test constructor:
        MyBinaryTree<String> stringTree = new MyBinaryTree<>("root");
        MyBinaryTree<Integer> intTree = new MyBinaryTree<>(1);
        System.out.println(stringTree.getRoot().getClass().getName());
        System.out.println(intTree.getRoot().getClass().getName());
        /*
        Your class name of tree node
         */

        //2. test the count of add nodes:
        MyBinaryTree<String> stringTree2 = new MyBinaryTree<>("root");
        stringTree2.addTreeNodes("01101", new String[]{"a", "b", "c", "d", "e"});
        System.out.println(stringTree2.getSize());
        stringTree2.addTreeNodes("10", new String[]{"f", "g"});
        stringTree2.addTreeNodes("11", new String[]{"h", "i"});
        stringTree2.addTreeNodes("001", new String[]{"j", "k", "l"});
        System.out.println(stringTree2.getSize());
        /*
        6
        11
         */

        //test int add node
        intTree.addTreeNodes("010", new Integer[]{2, 3, 4});
        intTree.addTreeNodes("001", new Integer[]{5, 6, 7});
        intTree.addTreeNodes("1010", new Integer[]{8, 9, 10, 11});
        intTree.addTreeNodes("1110", new Integer[]{12, 13, 14, 15});
        System.out.println(intTree.getSize());
        /*
        13
         */

        //Bonus: test level traverse
//        System.out.println(stringTree2.levelTraverse());
//        System.out.println(intTree.levelTraverse());
        /*
        root j h k b g i l c d e
        1 5 12 6 3 9 13 7 4 10 14 11 15
         */
    }
}
