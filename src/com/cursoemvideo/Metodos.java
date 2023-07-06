
package com.cursoemvideo;


public class Metodos {
    
    //retornando void (retornando nada)
    //forma errada!!!!!
    public static void soma(int a,int b){
        int s = a + b;
        System.out.println(s);
        
    }
    //retornando int (retornando um valor inteiro)
    //forma certa!!!!!
    public static int soma2(int a,int b){
        int s = a + b;
        return s;
    }
    
    
    
    
    public static void main(String[] args){
        System.out.println("Começo!");
        soma(5,2);
        
        int sm = soma2(10,10);
        System.out.println("A soma vale sm"+ sm);
        
    
    }
}
