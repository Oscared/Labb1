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
        Human newHuman=new Human(22,"Oscar");
        System.out.println(newHuman.toString());
        System.out.println(newHuman.getAge());
        System.out.println(newHuman.getName());
        System.out.println(newHuman);
    }    
    private int age;
    private String name;
    public void  setAge(int a){
    age=a;
    }
    public void setName(String n){
        name=n; 
    }
    public Human(int ageln, String nameln){
    age=ageln;
    name=nameln;        
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


