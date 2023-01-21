package com.exo;

import java.util.Scanner;


public class Exo17{
    public static void main(String []args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de ligne ? ");
    

        int ligne = sc.nextInt();
        System.out.println();

        for(int i=1;i<=ligne;i++){
            for(int j=1;j<=ligne*2-1;j++){
                
                if(j<=(ligne-i) || j >= (ligne+i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        sc.close();

        

    }
}