package com.example;

public class basicRecursion {
    public static void show(int count ) {
        //show();
        //int count=1; declaration is never done inside a recursive function
        if(count<=5){
            System.out.println("show()-"+count);
            show(count+=1);
            System.out.println("backtrack"+ count);
        }
    }
}
