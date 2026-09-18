package week4;

public class Terrible{
    public static int add(int a, int b){
        if (a==0){
            return b;
        } else if (a>0){
            int temp=add(a-1,b+1);
            return temp;
        } else {
            int temp= add(a+1,b-1);
            return temp;
        }
    }
    public static void main(String[] args) {
        int temp=add(3,5);

        int[] nums=new int[3];

        int total=0;
        int total2=0;
        for (int x=0;x<nums.length;x++){
            for (int y=0;y<1000;y++){
                for (int z=0;z<1000;z++){
                    total+=nums[x];
                    total2*=nums[x];
                }
            }
        }
    }
}