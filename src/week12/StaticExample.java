package week12;

public class StaticExample{
    private static int count;

    public StaticExample(){
        this.count=0;
    }

    public void addToCount(){
        this.count++;
    }

    public int getCount(){
        return this.count;
    }

    public static void main(String[] args) {
        StaticExample s1=new StaticExample();
        StaticExample s2=new StaticExample();
        StaticExample s3=new StaticExample();
        StaticExample s4=new StaticExample();

        s1.addToCount();
        s2.addToCount();
        s3.addToCount();
        s4.addToCount();

        System.out.println("s1 count: "+s1.getCount());
        StaticExample s5=new StaticExample();
        System.out.println("s1 count: "+s1.getCount());
    }
}