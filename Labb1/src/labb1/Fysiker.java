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
        Fysiker nyFysiker=new Fysiker(22, "Oscar", 2015);
        System.out.println(nyFysiker.toString());
        Fysiker randFysiker=new Fysiker();
        System.out.println(randFysiker.toString());
        System.out.println(randFysiker.getYear());
        
        
        Fysiker[] randFysikerArr; 
        randFysikerArr=new Fysiker[10];
        
        for(int i=0; i<10; i++){
            randFysikerArr[i]=new Fysiker();
        
            System.out.println(randFysikerArr[i].toString());
        }
        
        Human[] randPepsArr;
        randPepsArr=new Human[10];
        
        for(int i=0; i<10; i++){
            if(i<5){
                randPepsArr[i]=new Human();
                System.out.println(randPepsArr[i].toString());
                
            }
            else{
                randPepsArr[i]=new Fysiker();
                System.out.println(randPepsArr[i].toString());
            }
        }
    }
    
    private static int checkAge(int ageln, int yearln) throws Exception{
        if (2017-ageln+15>=yearln){
            throw new Exception();
        }
        else if (yearln<1932 || yearln>2015){
            throw new Exception();
        }
        else{
            return yearln;
        }
        
    }
    
    public Fysiker(int ageln, String nameln, int yearln) {
        super(ageln, nameln);
        
        try{
            year=checkAge(ageln, yearln);
            System.out.println("Årtal och ålder fungerar!");
        }catch (Exception e){
            System.err.println("Caught: " + e.getMessage() + ". Ålder funkar inte!");
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
        return humanString + " Började Fysik " + year + ".";
    }
    
    public int getYear(){
        return year;
    }
}
