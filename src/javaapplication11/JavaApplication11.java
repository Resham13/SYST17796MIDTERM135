/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author r2kar
 */

public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    static Seasons season;
    private boolean abc=true;
    public  enum Seasons{
        FALL,
        WINTER,
        SPRING,
        SUMMER
    }
    //a constructor
    public JavaApplication11(Seasons season)
    {
        this.season = season;
    }
   
    public void seasonDescription()
    {
       switch (season){
            case FALL:
                System.out.println("my fav. season!");
                break;
            case WINTER:
                System.out.println("it is too cold!");
                break;
            case SPRING:
                System.out.println("my allerg!");
                break;
            case SUMMER:
                System.out.println("it is hot!");
                break;
     }
    }
    public  String toString(){
        switch(season){
        case FALL :
            return "Fall";
        case WINTER :
            return "Winter";
        case SPRING :
            return "Spring";
        case SUMMER :
            return "Summer";
        }
       
        return null;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        // try to get the input (myStr) from the user
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a season name : ");
        String myStr= in.next();
        System.out.println(isSeason(myStr));
        JavaApplication11 test1= new JavaApplication11(Seasons.valueOf(myStr));
        test1.seasonDescription();
        //test1.isSeason();
        int ord = Seasons.valueOf(myStr).ordinal();
        System.out.println(Seasons.valueOf(myStr).ordinal());
        //a for loop that iterated thru the Seasons Enum using values() method
        for (Seasons mySeason: Seasons.values())
        {
            
            System.out.println(mySeason);
        }
       
        }
    public static boolean isSeason(String myStr){
        if(myStr == null || myStr.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid season name");
        } else if (myStr.equalsIgnoreCase(season.FALL.toString())){
            return true;
        } else if (myStr.equalsIgnoreCase(season.SPRING.toString())){
            return true;
        } else if(myStr.equalsIgnoreCase(season.SUMMER.toString())){
            return true;
        } else if(myStr.equalsIgnoreCase(season.WINTER.toString())){
            return true;
        } else{
            return false;
        }
    }
    
    }
    

