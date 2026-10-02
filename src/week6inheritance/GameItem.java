package week6inheritance;

public abstract class GameItem{
    protected  double xLoc;
    protected  double yLoc;

    public GameItem(double x, double y){
        this.xLoc=x;
        this.yLoc=y;
    }
    public double getXLoc(){
        return this.xLoc;
    }
    public double getYLoc(){
        return this.yLoc;
    }
    public void move(double x,double y){
        this.xLoc+=x;
        this.yLoc+=y;
    }
    //public abstract void use(Player player);

    public String toString(){
        String out="("+this.xLoc+","+this.yLoc+")";
        return out;
    }

}