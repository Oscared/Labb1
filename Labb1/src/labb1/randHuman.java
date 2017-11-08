/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labb1;

/**
 *
 * @author marsta
 */
public class randHuman {   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        randHuman[] randArray; 
        randArray=new randHuman[15];
        
        for(int i=0; i<15; i++){
            randArray[i]=new randHuman();
        
            System.out.println(randArray[i].toString());
        }
    }    
    
    private int age;
    private String name; 
    private static String[] fysikerName={"Oscar", "Martin", "André", "Emil", "Anders", "Klas", "Thomas", "Max", "Ebba", "Anton", "Linn", "Tobbe", "Leo", "Marcus", "Ullis"};
      
    public randHuman(int ageln, String nameln){
    age=ageln;
    name=nameln;        
    }
      
    private static int randomnumber(){
        int randAge=(int)(Math.random()*100);
        return randAge;
    }    
    private static String randomname(){
        String randName=fysikerName[(int)(Math.random()*15)];
        return randName;
    }
    
    public randHuman(){ /* Lite extern hjälp kring this */
        this(randomnumber(),randomname());
    }
          
   
    public String toString(){
     return "namn: " + name + ", ålder: " + age + " år.";
    
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }

   
    
}