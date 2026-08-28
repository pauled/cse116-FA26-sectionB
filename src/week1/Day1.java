package week1;

public class Day1{
    public static double multiplyBy2(double valIn){
        double temp=valIn*2;
        return temp;
    }
    public static void main(String[] args) {
        System.out.println("hello nurse");
        int x=5; //it is a number without a decimal point
        //hey this is a comment
        /*
        this is a multi line comment
        cool right
        */
       double y=6.5;//double is the equivelant of a float
       String str1="I am a string";//cannot use '
       boolean t1=false;//damn you Java
       double out=multiplyBy2(y);
       System.out.println("result is: "+out);
    }
}