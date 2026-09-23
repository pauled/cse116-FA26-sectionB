package week5linkedlist;

public class LLN<T>{
    private T value;
    private LLN next;

    public LLN(T value, LLN next){
        this.next=next;
        this.value=value;
    }

    public T getValue(){
        return this.value;
    }
    /*
    public String toString(){
        LLN<T> current=this;
        String out="";
        while (current!=null){
            out+=current.value+" ";
            current=current.next;
        }
        return out;
    }*/
    public String toString(){
        if (this.next==null){
            return ""+this.value;
        } else {
            return this.value+" "+this.next.toString();
        }
    }
    public void insert(T value,int loc){
        if (loc==0){
            this.next=new LLN(this.value,this.next);
            this.value=value;
        } else {
            this.next.insert(value, loc-1);
        }
    }
    public boolean find(T toFind){
        if (this.value.equals(toFind)){
            return true;
        } else if (this.next==null){
            return false;
        } else {
            return this.next.find(toFind);
        }
    }

    public static void main(String[] args) {
        LLN<Integer> head=new LLN<>(1,null);
        head=new LLN<>(2,head);
        head=new LLN<>(3,head);
        System.out.println(head);
    }

}