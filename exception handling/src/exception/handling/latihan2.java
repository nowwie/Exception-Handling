/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling;

/**
 *
 * @author Novita Azka Maghfira
 */
public class latihan2 {
    public static void test (int n)
            throws NullPointerException,  ArithmeticException{
            if (n<0){
                throw new NullPointerException(
                "KESALAHAN: null pointer");
            }else {
                throw new ArithmeticException(
                "KESALAHAN: arithmetic exception");
            }
    }
    
    public static void main(String[] args) {
        try{
            test(-12);
            //test(0);
        } catch (Exception e){
             System.out.println("Eksepsi ditangkap disini ");
        System.out.println(e.getMessage());
        }
            System.out.println("Statemen setelah blok try-catch");
    }
        
}
