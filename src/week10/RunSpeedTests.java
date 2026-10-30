package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import week7.Comparator;
import week7.InsertionSort;
import week7.IntIncreasing;

public class RunSpeedTests{
    public static int[] generateRandoms(int size){
        Random random=new Random();
        int[] out=new int[size];
        for (int x=0;x<size;x++){
            out[x]=random.nextInt();
        }
        return out;
    }
    public static int[] addRandoms(int size,int[] valsIn){
        Random random=new Random();
        int[] out=new int[size+valsIn.length];
        for (int x=0;x<size;x++){
            out[x]=random.nextInt();
        }
        for (int x=0;x<valsIn.length;x++){
            out[x+size]=valsIn[x];
        }
        return out;
    }
    
    public static void printArray(int[] arrayIn){
        String out="";
        for (int x=0;x<arrayIn.length;x++){
            out+=arrayIn[x]+" ";
        }
        System.out.println(out);
    }
    public static ArrayList<Integer> copyArray(int[] arrayIn){
        ArrayList<Integer> arrayOut=new ArrayList<>();
        for (int x=0;x<arrayIn.length;x++){
            arrayOut.add(arrayIn[x]);
        }
        return arrayOut;
    }
    public static void main(String[] args) {
        TimeMe timer=new TimeMe();
        Comparator temp=new IntIncreasing();
        InsertionSort<Integer> sorter=new InsertionSort<>(temp);

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,6,5));
        ArrayList<Integer> output=sorter.sort(list);
        System.out.println(output);

        MergeSort2<Integer> sorterMerge=new MergeSort2<>(new IntIncreasing());


        for (int size=10;size<1000000000;size*=5){
            int[] randInts=generateRandoms(size);
            //printArray(randInts);
    
            timer.start();
            int[] sortedInts=MergeSort.mergeSort(randInts);
            timer.lap();
            //printArray(sortedInts);
            System.out.println("merge items: "+size+" "+timer);


            ArrayList<Integer> randIntegers=copyArray(randInts);
            timer.start();
            ArrayList<Integer> sorted2=sorterMerge.mergeSort(randIntegers);
            timer.lap();
            System.out.println("merge2 items: "+size+" "+timer);

            timer.start();
            int[] sortedBubble=BubbleSort.bubbleSort(randInts);
            timer.lap();
            System.out.println("bubble items: "+size+" "+timer);

            int[] randInts2=addRandoms(10,sortedInts);

            timer.start();
            sortedInts=MergeSort.mergeSort(randInts2);
            timer.lap();
            //printArray(sortedInts);
            System.out.println("add-merge items: "+size+" "+timer);


            randIntegers=copyArray(sortedBubble);
            timer.start();
            sorted2=sorterMerge.mergeSort(randIntegers);
            timer.lap();
            System.out.println("add-merge2 items: "+size+" "+timer);

            timer.start();
            sortedBubble=BubbleSort.bubbleSort(randInts2);
            timer.lap();
            System.out.println("add-bubble items: "+size+" "+timer);
        }
    }
}