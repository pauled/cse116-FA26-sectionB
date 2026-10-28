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

        for (int size=10;size<1000000000;size*=10){
            int[] randInts=generateRandoms(size);
            //printArray(randInts);
            timer.start();
            int[] sortedInts=MergeSort.mergeSort(randInts);
            timer.lap();
            //printArray(sortedInts);
            System.out.println("merge items: "+size+" "+timer);

            ArrayList<Integer> randIntegers=copyArray(randInts);
        }
    }
}