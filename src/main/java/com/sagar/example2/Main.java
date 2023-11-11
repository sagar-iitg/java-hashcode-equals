package com.sagar.example2;

public class Main {
    public static void main(String[] args) {
        String str="FB";
        String str2="Ea";
        System.out.println(str.hashCode()+" "+str2.hashCode());
        System.out.println(str.equals(str2));
        String str3="";
        String str4=new String("");
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        System.out.println(str3.equals(str4));


        //heap memeory is nor same -- different object

        String obj=new String("sk");
        String obj1=new String("sk");
        System.out.println(obj1.hashCode()+" "+obj.hashCode());
        System.out.println(obj.equals(obj1));
        System.out.println(obj1==obj);



        //heap memeory same only one object
        String obj2="abc";
        String obj3="abc";
        System.out.println(obj2.hashCode()+" "+obj3.hashCode());
        System.out.println(obj2.equals(obj3));
        System.out.println(obj2==obj3);




    }
}
