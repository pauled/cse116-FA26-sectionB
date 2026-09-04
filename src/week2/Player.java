package week2;

public class Player{
    //instance variables or state variables or object variable
    private int maxHP;
    private int HP;
    private int damageDealt;

    public Player(int maxHP){
        this.HP=maxHP;
        this.maxHP=maxHP;
        this.damageDealt=4;
    }
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    //write a method attack that deals damage to a second player
    public void attack(Player other){
        other.takeDamage(this.damageDealt);
    }

    public static void main(String[] args) {
        Player p1=new Player(10);
        Player p2=new Player(9);
        Player p3=p1;
        p3.takeDamage(5);
        p1.attack(p2);
    }

}