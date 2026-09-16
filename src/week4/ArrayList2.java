package week4;

public class ArrayList2{
    int[] vals;
    int size;

    //defaults to holding 3 values
    //write
    public ArrayList2(){
        this.vals=new int[3];
        int size=0;
    }
    //1)constructor
    public int getVal(int location){
        if (location >= 0 && location<size){
            return this.vals[location];
        }
        return -1;
    }
    //2)getVal that take a location
    public void setVal(int value, int location){
        if (location >=0 && location<size){
            this.vals[location]=value;
        }
    }
    //3) setVal that takes a value and a location
    public void append(int value){
        if (this.size>=this.vals.length){
            int[] temp=new int[this.vals.length*2];
            for (int x=0;x<this.vals.length;x++){
                temp[x]=this.vals[x];
            }
            this.vals=temp;
        }
        this.vals[size]=value;
        this.size++;
    }
    //4) write an append that takes a value
    public static void main(String[] args) {
        int[] nums=new int[3];

        nums[0]=2;
        nums[1]=4;
        nums[2]=8;
    }
}