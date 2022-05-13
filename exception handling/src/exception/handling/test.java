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
 class latihan3 extends Exception{
    latihan3(String s){
        super(s);
    }

}
public class test{
    static void validate (int age)throws latihan3{
        if(age<18)
            throw new latihan3("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String[] args) {
        try{
            validate(13);
        }
        catch(Exception i){
            System.out.println("Exception aktif "+i);
        }
        System.out.println("rest ");
    }
}