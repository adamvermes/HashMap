package com.company;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap();
        hashMap.addElements("Miki", "December");
        hashMap.addElements("Adi", "Januar");
        System.out.println(hashMap.getValue("Miki"));
        System.out.println(hashMap.getValue("Adi"));
//        System.out.println(hashMap.getValue("Adika")); Exception Handling
    }
}
