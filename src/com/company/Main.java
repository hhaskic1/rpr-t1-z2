package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

    int n=0;


    System.out.println("Unesite broj n: ");
    Scanner unos=new Scanner(System.in);
    n=unos.nextInt();

    for(int i=1; i<n; i++)
        if ( i % sumaCifara(i) == 0)
            System.out.println(i);
    }

  public static int  sumaCifara(int n){
       int suma=0;
       int a;

           while(n!=0){
               a=n%10;
               suma+=a;
               n/=10;
           }
   return suma;
  }

}
