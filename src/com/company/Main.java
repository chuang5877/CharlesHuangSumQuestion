package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	sumQuestion();
    }
    public static void sumQuestion(){
        Scanner in=new Scanner(System.in);
        int out=0;
        System.out.print("Sum up to what number?");
        int s=in.nextInt();
        for(int n=1;n<=s;n++){
            out+=n;
        }
        System.out.print("The sum of all integers from 1 to "+s+" is "+out);
    }
}
