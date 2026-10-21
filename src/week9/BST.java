package week9;

import week7.Comparator;

public class BST<A>{
    private BTN<A> root;
    private Comparator<A> comparator;

    public BST(Comparator<A> comparator){
        this.comparator=comparator;
        this.root=null;
    }
}