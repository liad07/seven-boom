package com.company;
import java.util.*;
public class Main {
public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("what num you pick");
int num;
num= reader.nextInt();
        for (int i = 0; i < num; i++) {
            if (i%7==0){
                System.out.println("boom");
            }
            else
            System.out.println(i);
        }
    }
}
