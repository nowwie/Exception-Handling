/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling;

import java.util.Scanner;

/**
 *
 * @author Novita Azka Maghfira
 */
public class latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int a=100;
       // System.out.println("Enter the value for  b");
        Scanner c = new Scanner(System.in);
       // int b = c.nextInt();
        
        System.out.println("Enter the value for c");
        
        //Exception Handling
        try{
        int d= c.nextInt();
        int res =d/0;
           //10/(b-d);
            System.out.println("The result is "+res);
    }
    catch (Exception e){
        e.printStackTrace();
        System.out.println("adalah: "+e);
        }
    }
}
