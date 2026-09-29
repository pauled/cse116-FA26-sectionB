package week6inheritance;

public class HealthPotion extends GameItem{
    private int increase;

    public HealthPotion(double x,double y,int increase){
        super(x,y);
        this.increase=increase;
    }
    public static void main(String[] args) {
        HealthPotion hp1=new HealthPotion(1,2,3);
        System.out.println(hp1.getXLoc());
    }
}