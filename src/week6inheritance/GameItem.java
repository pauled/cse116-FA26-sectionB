package week6inheritance;

public class GameItem{
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
    public String toString(){
        String out="("+this.xLoc+","+this.yLoc+")";
        return out;
    }

}