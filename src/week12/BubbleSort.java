package week12;

public class BubbleSort{
    private static long count=0;

    public void resetCount(){
        this.count=0;
    }
    public long getCount(){
        return this.count;
    }

    public int[] bubbleSort(int[] valsIn){
        int[] vals=new int[valsIn.length];
        this.count+=1;
        for (int x=0;x<valsIn.length;x++){
            vals[x]=valsIn[x];
            this.count+=3;
        }
        this.count+=3;

        boolean outOfOrder=true;
        int x=0;
        while (outOfOrder){
            this.count+=4;
            outOfOrder=false;
        //for (int x=0;x<vals.length;x++){
            for (int y=0;y<vals.length-x-1;y++){
                this.count+=3;
                if (vals[y]>vals[y+1]){
                    outOfOrder=true;
                    int temp=vals[y];
                    vals[y]=vals[y+1];
                    vals[y+1]=temp;
                    this.count+=4;
                }
            }
            x++;
        }
        return vals;
    }
}