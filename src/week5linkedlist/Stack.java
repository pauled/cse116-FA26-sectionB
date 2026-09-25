package week5linkedlist;

public class Stack<G>{
    private LLN<G> head;

    public Stack(){
        this.head=null;
    }
    public void push(G value){
        LLN<G> temp=new LLN<>(value,this.head);
        this.head=temp;
    }
    public G pop(){
        G temp=this.head.getValue();
        this.head=this.head.getNext();
        return temp;
    }
    public String toString(){
        if (this.head==null){
            return "empty";
        }
        return this.head.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}