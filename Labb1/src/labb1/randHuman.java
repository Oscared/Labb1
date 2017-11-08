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
        setFysikerName();
        randHuman[] randArray; 
        randArray=new randHuman[15];
        
        for(int i=0; i<15; i++){
            randArray[i]=new randHuman();
        
            System.out.println(randArray[i].toString());
        }
    }    
    
    private int age;
    private String name; 
    private static String[] fysikerName;
   
    
    
    
    private static void setFysikerName(){
        
        fysikerName=new String[15];
        fysikerName[0]="Oscar";
        fysikerName[1]="Martin";
        fysikerName[2]="André";
        fysikerName[3]="Emil";
        fysikerName[4]="Anders";
        fysikerName[5]="Klas";
        fysikerName[6]="Thomas";
        fysikerName[7]="Max";
        fysikerName[8]="Ebba";
        fysikerName[9]="Anton";
        fysikerName[10]="Linn";
        fysikerName[11]="Tobbe";
        fysikerName[12]="Leo";
        fysikerName[13]="Marcus";
        fysikerName[14]="Ullis";
    }
    
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