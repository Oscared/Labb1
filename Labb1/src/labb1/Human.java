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
public class Human {   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Human newhuman;
        newhuman = new Human(22,"Martin");
        
        /*System.out.println(newhuman.toString());
        System.out.println(newhuman.getName());
        System.out.println(newhuman.getAge());
        Human fysiker=new Human();
        System.out.println(fysiker);*/
        newhuman.setFysikerName();
        System.out.println(fysikerName[1]);
    }    
    private int age;
    private String name; 
    private static String[] fysikerName;
    
    private String[] fysiker;
    
    
    
    public static void setFysikerName(){
   
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
    
    public Human(int ageln, String nameln){
    age=ageln;
    name=nameln;        
    }

    public Human(){
        int randAge=(int)(Math.random()*100);
        String randName=fysikerName[(int)(Math.random()*15)];
        /* Human(randAge, randName); */
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