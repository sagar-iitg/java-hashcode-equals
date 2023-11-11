package com.sagar.example3;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder ans=new StringBuilder("sagar");
        StringBuilder ans1=new StringBuilder("sagar");
        System.out.println(ans.hashCode());
        System.out.println(ans1.hashCode());
        System.out.println(ans.equals(ans1));

    }
}
