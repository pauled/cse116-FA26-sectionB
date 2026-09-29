package week6inheritance;

public class GameItem{
    private double xLoc;
    private double yLoc;

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
    
}