package week6inheritance;

public class Weapon extends GameItem{
    private double damage;

    public Weapon(double x,double y,double damage){
        super(x,y);
        this.damage=damage;
    }
    public String toString(){
        String out=super.toString();
        out+=" damage: "+this.damage;
        return out;
    }
    public static void main(String[] args) {
        Weapon w1=new Weapon(1,2,3);
        HealthPotion h1=new HealthPotion(4,5,6);
        String out=w1.toString();
        System.out.println(out);
        System.out.println(w1.getXLoc());
        w1.move(5,5);
        h1.move(6,6);
        out=w1.toString();
        System.out.println(out);
    }
}