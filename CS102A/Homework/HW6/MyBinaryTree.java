/*class TreeNode<T>{
    T value;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T value){
        this.value=value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }
}


public class MyBinaryTree<T>{
    private TreeNode<T> root;
    private int size;

    public MyBinaryTree(T value){
        root=new TreeNode<>(value);
        size=1;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addTreeNodes(String directions, T[] values){
        int test=0;int count=0;
        TreeNode<T> abc=null;
        abc=root;
        test=directions.length();
        while (count<test){
            if (abc.getRight()!=null&&directions.substring(count,count+1).equals("1")){
                abc.getRight().setValue(values[count]);
                abc=abc.getRight();count=count+1;
                continue;//System.out.print(count);
            }
            if (abc.getLeft()!=null&&directions.substring(count,count+1).equals("0")){
                abc.getLeft().setValue(values[count]);
                abc=abc.getLeft();
                count=count+1;//System.out.print(count);
                continue;
            }
            if (abc.getRight()==null&&directions.substring(count,count+1).equals("1")){
                abc.setRight(new TreeNode<T>(null));
                abc.getRight().setValue(values[count]);
                abc=abc.getRight();
                count=count+1;setSize(getSize()+1);
                continue;
            }
            if (abc.getLeft()==null&&directions.substring(count,count+1).equals("0")){
                abc.setLeft(new TreeNode<T>(null));
                abc.getLeft().setValue(values[count]);
                abc=abc.getLeft();
                count=count+1;setSize(getSize()+1);
                continue;

            }
            count=count+1;
        }


    }

    public String levelTraverse(){
        return null;
    }
}*/

/*public class MyBinaryTree<T> {
    private Node<T> root;
    private int size;

    public MyBinaryTree(T rootValue) {
        root = new Node<T>(rootValue);
        size = 1;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addTreeNodes(String directions, T[] values) {
        Node<T> now = root;
        for(int i = 0; i < directions.length(); ++i) {
            if(directions.charAt(i) == '0') {
                if(now.getLeftChild() == null) {
                    now.setLeftChild(new Node<T>(values[i]));
                    ++size;
                    now = now.getLeftChild();
                } else {
                    now = now.getLeftChild();
                    now.setValue(values[i]);
                }
            } else {
                if(now.getRightChild() == null) {
                    now.setRightChild(new Node<T>(values[i]));
                    ++size;
                    now = now.getRightChild();
                } else {
                    now = now.getRightChild();
                    now.setValue(values[i]);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public String levelTraverse() {
        String ret = new String();
        Object[] q = new Object[this.size];
        int l = 0, r = -1;
        q[++r] = root;
        while(l <= r) {
            Node<T> node = (Node<T>)q[l++];
            if(node.getLeftChild() != null) q[++r] = node.getLeftChild();
            if(node.getRightChild() != null) q[++r] = node.getRightChild();
            ret += node.getValue().toString() + " ";
        }
        return ret.trim();
    }
}

class Node<T> {
    private T value;
    private Node<T> leftChild, rightChild;
    public Node() {}
    public Node(T value) {
        this.value = value;
        leftChild = rightChild = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }
}*/

import java.util.LinkedList;
import java.util.Queue;

class TreeNode<T> {
    T value;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}


class TreeNode2<T> {
    T value;
    TreeNode2<T> left;
    TreeNode2<T> right;

    public TreeNode2(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

public class MyBinaryTree<T> {
    private TreeNode2<T> root;
    private int size;

    public MyBinaryTree(T root) {
        this.root = new TreeNode2<>(root);
        size = 1;
    }

    public TreeNode2<T> getRoot() {
        return root;
    }

    public void addTreeNodes(String directions, T[] values) {
        TreeNode2<T> current = root;
        for (int i = 0; i < directions.length(); i++) {
            if (directions.charAt(i) == '0') {
                if (current.left != null) {
                    current.left.value = values[i];
                } else {
                    current.left = new TreeNode2<>(values[i]);
                    size++;
                }
                current = current.left;
            } else {
                if (current.right != null) {
                    current.right.value = values[i];
                } else {
                    current.right = new TreeNode2<>(values[i]);
                    size++;
                }
                current = current.right;
            }
        }
    }

    public int getSize() {
        return size;
    }

    //bonus part
    public String levelTraverse() {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode2<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode2<T> node = queue.poll();
            sb.append(" ").append(node.value);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return sb.toString();

    }


}






