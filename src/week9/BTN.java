package week9;

public class BTN<A>{
    public A value;
    public BTN<A> left;
    public BTN<A> right;

    public BTN(A value, BTN<A> left,BTN<A> right){
        this.value=value;
        this.left=left;
        this.right=right;
    }
    public String preOrderTraversal(BTN<A> node){
        // top node, left node, right node
        //5 2 -3 4 8 7 14
        if (node==null){
            return "";
        } else {
            String out="";
            out+=node.value.toString()+" ";
            out+=preOrderTraversal(node.left);
            out+=preOrderTraversal(node.right);
            return out;
        }
    }
    public String postOrderTraversal(BTN<A> node){
        //left right top
        if (node==null){
            return "";
        } else {
            String out="";
            out+=postOrderTraversal(node.left);
            out+=postOrderTraversal(node.right);
            out+=node.value.toString()+" ";
            return out;
        }
    }
    public String inOrderTraversal(BTN<A> node){
        //left top right
        if (node==null){
            return "";
        } else {
            String out="";
            if (node.left!=null){
                out+=inOrderTraversal(node.left);
            }
            out+=node.value.toString()+" ";
            if (node.right!=null){
                out+=inOrderTraversal(node.right);
            }
            return out;
        }
    }

    public static void main(String[] args) {
        BTN<Integer> root=new BTN<>(5,null,null);
        root.left=new BTN<>(2,null,null);
        root.right=new BTN<>(8,null,null);
        root.left.left=new BTN<>(-3,null,null);
        root.left.right=new BTN<>(4,null,null);
        root.right.left=new BTN<>(7,null,null);
        root.right.right=new BTN<>(14,null,null);
        //String temp=root.preOrderTraversal(root);
        //System.out.println("preOrder: "+temp);
        //temp=root.postOrderTraversal(root);
        //System.out.println("postOrder: "+temp);
        String temp=root.inOrderTraversal(root);
        System.out.println("inOrder: "+temp);
    }
}