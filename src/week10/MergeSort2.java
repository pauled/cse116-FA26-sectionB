package week10;

import java.util.ArrayList;

import week7.Comparator;

public class MergeSort2<A>{
    private Comparator comparator;

    public MergeSort2(Comparator compare){
        this.comparator=compare;
    }
    public ArrayList<A> mergeSort(ArrayList<A> data){
        if (data.size()==1){
            return data;
        } else {
            ArrayList<A> half1=new ArrayList<>();
            ArrayList<A> half2=new ArrayList<>();
            for (int x=0; x<data.size()/2; x++){
                half1.add(data.get(x));
            }
            for (int x=data.size()/2; x<data.size(); x++){
                half2.add(data.get(x));
            }
            ArrayList<A> sorted1=mergeSort(half1);
            ArrayList<A> sorted2=mergeSort(half2);
            ArrayList<A> out=combine(sorted1,sorted2);
            return out;
        }
    }
    public ArrayList<A> combine(ArrayList<A> half1,ArrayList<A> half2){
        ArrayList<A> out=new ArrayList<>();
        int loc1=0;
        int loc2=0;

        while (loc1<half1.size() && loc2<half2.size()){
            if (this.comparator.compare(half1.get(loc1), half2.get(loc2))){
                out.add(half1.get(loc1));
                loc1++;
            } else {
                out.add(half2.get(loc2));
                loc2++;
            }
        }
        while (loc1<half1.size()){
            out.add(half1.get(loc1));
            loc1++;
        }
        while (loc2<half2.size()){
            out.add(half2.get(loc2));
            loc2++;
        }
        return out;
    }
}