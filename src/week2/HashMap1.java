package week2;

import java.util.HashMap;

public class HashMap1{

    public static void main(String[] args) {
        HashMap<String,Integer> bills=new HashMap<>();

        bills.put("Allen",17);
        bills.put("Cooke",4);

        System.out.println("what is Allen's number: "+bills.get("Allen"));
        for (String key : bills.keySet()){
            System.out.println(key);
        }
        for (Integer value : bills.values()){
            System.out.println(value);
        }
        for (String key : bills.keySet()){
            System.out.println(key+"'s number is: "+bills.get(key));
        }
    }
}