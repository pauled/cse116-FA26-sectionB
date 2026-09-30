package week6inheritance;

public class HealthPotion extends GameItem{
    private int increase;

    public HealthPotion(double x,double y,int increase){
        super(x,y);
        this.increase=increase;
    }
    public String toString(){
        String out=super.toString();
        out+=" health added: "+this.increase;
        return out;
    }
    public static void main(String[] args) {
        HealthPotion hp1=new HealthPotion(1,2,3);
        System.out.println(hp1.getXLoc());
    }
}