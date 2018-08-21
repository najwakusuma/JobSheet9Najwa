/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;
import  java.util.Scanner;
/**
 *
 * @author user
 */
public class Latihan4 {
    public static int x(int a, int b, int c){
        System.out.println("kecepatan = " + (a/b));   
        return c;
    }
    public static void main(String[] args)
    {
        int a, b;
        Scanner scanner = new Scanner(System.in);
    System.out.print("jarak = ");
    a = scanner.nextInt();
    System.out.print("waktu tempuh = ");
    b = scanner.nextInt();
    double kecepatan = (a/b);
    System.out.print("kecepatan = "+ kecepatan +"KM/JAM");
    
    }
}
