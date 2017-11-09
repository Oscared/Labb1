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
public class Human implements Comparable<Human>{   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        Human newhuman;
        newhuman = new Human(22,"Martin");
        
        System.out.println(newhuman.toString());
        System.out.println(newhuman.getName());
        System.out.println(newhuman.getAge()); 
        
        Human fysiker=new Human();
        System.out.println(fysiker);
        System.out.println("Del 1 klar!");
        
        
        Human human1;
        human1=new Human();
        
        Human human2;
        human2=new Human();
        
        if(human1.compareTo(human2)<0){
            System.out.println(human2.getName() + ", som är " + human2.getAge() + " år, är äldre än "
                    + human1.getName() + " som är " + human1.getAge() + " år.");
        }
        else if(human1.compareTo(human2)>0){
            System.out.println(human1.getName() + ", som är " + human1.getAge() + " år, är äldre än "
                    + human2.getName() + " som är " + human2.getAge() + " år.");
        }
        else{
            System.out.print("De är lika gamla.");
        }
    }    
    
    private int age;
    private String name; 
    private static String[] ListOfNames={"Oscar", "Martin", "André", "Emil", "Anders", "Klas", "Thomas", "Max", "Ebba", "Anton", "Linn", "Tobbe", "Leo", "Marcus", "Ullis"};
    
    
    public Human(int ageln, String nameln){
    age=ageln;
    name=nameln;        
    }
      
    private static int randomnumber(){
        int randAge=(int)(Math.random()*100);
        return randAge;
    }    
    private static String randomname(){
        String randName=ListOfNames[(int)(Math.random()*15)];
        return randName;
    }
    
    public Human(){ /* Lite extern hjälp kring this */
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

    public int compareTo(Human o){
        
    if(age<o.getAge()){
        return -1;
    } else if(age>o.getAge()){
        return 1;
    }
    else{
        return 0;
        }
    }
}
    


