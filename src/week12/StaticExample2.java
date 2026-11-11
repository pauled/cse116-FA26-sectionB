package week12;

public class StaticExample2{
    private static int count=0;

    public void addToCount(){
        this.count++;
    }

    public int getCount(){
        return this.count;
    }
    public void resetCount(){
        this.count=0;
    }

    public static void main(String[] args) {
        StaticExample2 s1=new StaticExample2();
        StaticExample2 s2=new StaticExample2();
        StaticExample2 s3=new StaticExample2();
        StaticExample2 s4=new StaticExample2();

        s1.addToCount();
        s2.addToCount();
        s3.addToCount();
        s3.resetCount();
        s4.addToCount();

        System.out.println("s1 count: "+s1.getCount());
        StaticExample2 s5=new StaticExample2();
        System.out.println("s1 count: "+s1.getCount());
    }
}