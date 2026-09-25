package week5linkedlist;

public class Queue<T>{
    private LLN<T> head;
    private LLN<T> tail;

    public Queue(){
        this.head=null;
        this.tail=null;
    }

    public void endqueue(T value){
        if (this.tail==null){
            this.tail=new LLN<T>(value,null);
            this.head=this.tail;
        } else {
            this.tail.setNext(new LLN<T>(value,null));
            LLN<T> temp=this.tail.getNext();
            this.tail=temp;
        }
    }
    public String toString(){
        if (this.head==null){
            return "empty";
        }
        return this.head.toString();
    }
    public T dequeue(){
        T toReturn=null;
        if (this.head!=null){
            toReturn=this.head.getValue();
            this.head=this.head.getNext();
            if (this.head==null){
                this.tail=null;
            }
        }
        return toReturn;
    }
}