package week5linkedlist;

public class LLNint{
    private int value;
    private LLNint next;

    public LLNint(int val,LLNint next){
        this.value=val;
        this.next=next;
    }
    public String toString(){
        return "what";
    }

    public static void main(String[] args) {
        LLNint head=new LLNint(1,null);
        head=new LLNint(2,head);
        head=new LLNint(3,head);
        System.out.println(head);
    }
}