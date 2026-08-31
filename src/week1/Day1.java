package week1;

public class Day1{
    public static double multiplyBy2(double valIn){
        double x=valIn*2;
        return x;
    }
    public static String letter(int grade){
        int tens=grade/10;
        if (tens>=9){
            return "A";
        } else if (tens>=8){
            return "B";
        } else if (tens>=7){
            return "C";
        } else if (tens>=6){
            return "D";
        } else {
            return "F";
        } 
    }
    public static void main(String[] args) {
        System.out.println("hello nurse");
        int x=5; //it is a number without a decimal point
        x=10;
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
       str1=letter(78);
       double val=10.0;
       while (val>1){
        System.out.println(val);
        val/=2;// val=val/2
       }
       //(start; conditional; increment)
       //z++ is same as z+=1 is same as z=z+1
       for (int z=0;          z<5; z++){
        System.out.println(z);
       }
       for (x=0;          x<5; x++){
        System.out.println(x);
       }
    }
}