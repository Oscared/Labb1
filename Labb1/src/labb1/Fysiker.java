/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labb1;

/**
 *
 * @author oscar
 */
public class Fysiker extends Human{
   
    private int year;
    
    public static void main(String[] args){
        
    }
    
    private static void checkAge(int ageln, int yearln) throws Exception{
        if (2017-ageln+15<=yearln){
            throw new Exception();
        }
    }
    
    public Fysiker(int ageln, String nameln, int yearln) {
        super(ageln, nameln);
        
        checkAge(ageln, yearln){
        try{
            System.out.println("Ålder funkar!");
        }catch (Exception e){
            System.err.println("Caught: " + e.getMessage() + ". Ålder funkar inte!");
            }
        }
        
        if (yearln<1932){
            System.out.println("Ej giltigt år.");
        }
        else if (yearln>2015){
            System.out.println("Ej giltigt år.");
        }
        else{
            year=yearln;
        }
    }
    
    private static int getRandYear(int age){
        int randYear=2017-age+15+(int)(Math.random()*(age-15));
        return randYear;
    }
    
    public Fysiker(){
        super();
        year=getRandYear(getAge());
    }
    
    public String toString(){
        
        String humanString=super.toString();
        return humanString + " började Fysik " + year + ".";
    }
    
}
