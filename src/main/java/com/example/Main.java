package com.example;

public class Main {
    public static void show(int count ) {
        //show();
        //int count=1;
        if(count<=5){
            System.out.println("show()-"+count);
            show(count+=1);
            System.out.println("backtrack"+ count);
        }
    }
    public static void main(String[] args) {
        show(1);

    }
}