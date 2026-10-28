package week10;

public class TimeMe{
    private long start;
    private long end;

    public TimeMe(){
        this.start=0;
        this.end=0;
    }
    public void start(){
        this.start=System.currentTimeMillis();
    }
    public void lap(){
        this.end=System.currentTimeMillis();
    }
    public String toString(){
        int dif=(int)(this.end-this.start);
        int totalSeconds=dif/1000;
        int seconds=totalSeconds%60;
        int minutes=(totalSeconds/60)%60;
        int hours=totalSeconds/(60*60);
        int milliseconds=dif%1000;
        String out=String.format("%02d:%02d:%02d.%03d",hours,minutes,seconds,milliseconds);
        return out;
    }
}