package com.sagar.example1;

public class Test {

    public static void main(String[] args) {
        Human sagar=new Human(1000,"Sagar Kumar");
        System.out.println(sagar.hashCode());


        Human mohit=new Human(2000,"Mohit Agarwala");
        System.out.println(mohit.hashCode());

       String a="sagar";
       String b="sagar";
        System.out.println(a.hashCode()+" "+ b.hashCode()+" "+ a.equals(b));
        int a1 = -100;
        int result = a1 >> 1;
        System.out.println(result);


    }
}
