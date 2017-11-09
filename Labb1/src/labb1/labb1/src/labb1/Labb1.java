/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labb1;

/**
 *
 * @author mastah
 */
public class Labb1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
        Fysiker[] fysikerArr;
        fysikerArr=new Fysiker[2];
        fysikerArr[0]=new Fysiker(22, "Oscar", 2015);
        fysikerArr[1]=new Fysiker(22,"Martin", 2014);
        Arrays.sort(fysikerArr);
        System.out.println(fysikerArr[0]);
        System.out.println(fysikerArr[1]);
    }
}
    

