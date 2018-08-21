/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Latihan5 {
    public static int nilai(int a, int b, int c, int maks){
        if(a>b&&b>c){
            maks = a;}
        else if(b>a&&a>c){
            maks = b;}
        else{
            maks = c;}
        
        return maks;
        }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan I = ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan II = ");
        int bil2 = input.nextInt();
        System.out.print("Masukkan bilangan III = ");
        int bil3 = input.nextInt();
        
       int maks = 0;
            
       int compare;
       compare = nilai (bil1,bil2,bil3,maks);
       
       System.out.println("Nilai terbessar adalah " + compare);
        }
        
    }

