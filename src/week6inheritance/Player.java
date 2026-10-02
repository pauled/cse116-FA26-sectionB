package week6inheritance;

import java.util.ArrayList;

public class Player extends GameItem{
    //instance variables or state variables or object variable
    private int maxHP;
    private int HP;
    private int damageDealt;
    private ArrayList<Usable> inventory;

    public Player(int maxHP,double x,double y){
        super(x,y);
        this.HP=maxHP;
        this.maxHP=maxHP;
        this.damageDealt=4;
        this.inventory=new ArrayList<>();
    }
    public Player(int maxHP){
        super(0,0);
        this.HP=maxHP;
        this.maxHP=maxHP;
        this.damageDealt=4;
        this.inventory=new ArrayList<>();
    }
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    //write a method attack that deals damage to a second player
    public void attack(Player other){
        other.takeDamage(this.damageDealt);
    }
    public int getHP(){
        return this.HP;
    }
    public int getMaxHP(){
        return this.maxHP;
    }
    public int getDamageDealt(){
        return this.damageDealt;
    }
    public void pickUpItem(Usable item){
        this.inventory.add(item);
    }
    public void useItem(int loc,Player player){
        this.inventory.get(loc).use(player);
    }

    public static void main(String[] args) {
        Player p1=new Player(10);
        Player p2=new Player(9);
        Player p3=p1;
        p3.takeDamage(5);
        p1.attack(p2);
    }

}