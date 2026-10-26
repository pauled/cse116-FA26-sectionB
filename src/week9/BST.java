package week9;

import week7.Comparator;
import week7.IntIncreasing;

public class BST<A>{
    private BTN<A> root;
    private Comparator<A> comparator;

    public BST(Comparator<A> comparator){
        this.comparator=comparator;
        this.root=null;
    }
    public boolean find(A value){
        if (this.root==null){
            return false;
        } else {
            return findHelper(value,this.root);
        }
    }
    public boolean findHelper(A value,BTN<A> node){
        if (node==null){
            return false;
        } else if(value.equals(node.value)){
            return true;
        } else if(this.comparator.compare(value, node.value)){
            return findHelper(value, node.left);
        } else {
            return findHelper(value, node.right);
        }
    }
    public void insert(A value){
        if (root==null){
            this.root=new BTN(value,null,null);
        } else {
            insertHelper(value, this.root);
        }
    }
    public void insertHelper(A value, BTN<A> node){
        if (this.comparator.compare(value, node.value)){
            if (node.left==null){
                node.left=new BTN(value,null,null);
            } else {
                insertHelper(value, node.left);
            }
        } else {
            if (node.right==null){
                node.right=new BTN(value,null,null);
            } else {
                insertHelper(value, node.right);
            }
        }
    }
    public String toString(){
        return this.root.inOrderTraversal(root);
    }
    public static void main(String[] args) {
        BST<Integer> tree=new BST(new IntIncreasing());
        tree.insert(17);
        tree.insert(24);
        tree.insert(5);
        tree.insert(-7);
        tree.insert(10);
        tree.insert(40);
        String out=tree.toString();
        System.out.println(out);
    }
}