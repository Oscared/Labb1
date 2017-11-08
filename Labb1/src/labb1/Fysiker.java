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
    
    private static int checkAge(int ageln, int yearln) throws Exception{
        if (2017-ageln+15<=yearln){
            throw new Exception();
        }
        else{
            return ageln;
        }
    }
    
    public Fysiker(int ageln, String nameln, int yearln) {
        super(ageln, nameln);
        
        try{
            
        }catch (Exception e){
            
        }
        if (yearln<1932){
            year=0000;
        }
        else if (yearln>2015){
            year=0000; //fixa så den retunrerar ett fel
        }
        else{
            year=yearln;
        }
    }
    
    private static int getRandYear(int age){
        int randYear=2017-age+15+(int)(Math.random()*84);
        return randYear;
    }
    
    public Fysiker(){
        super();
        year=getRandYear(getAge());
    }
    
    public String toString(){
        String humanString=super.toString();
        String fYear=String.format("%tC", sYear); 
        return humanString + " började Fysik " + year + ".";
    }
    
}
