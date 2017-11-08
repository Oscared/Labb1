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
    
    private static int checkAge(int ageln, int yearln){
        if (2017-ageln+15>=yearln){
            return 0000;
        }
        else{
            return ageln;
        }
    }
    
    public Fysiker(int ageln, String nameln, int yearln) {
        super(checkAge(ageln, yearln), nameln);
    
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
    
    private static int getRandYear(){
        int randYear=1932+(int)(Math.random()*83);
        return randYear;
    }
    
    public Fysiker(){
        super();
        year=getRandYear();
    }
    
    public String toString(){
        String humanString=super.toString();
        String fYear=String.format(%tC, year); 
        return humanString + " började Fysik " + year + ".";
        
        
    }
    
}
