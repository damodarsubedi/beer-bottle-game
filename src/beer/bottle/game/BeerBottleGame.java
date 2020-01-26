/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beer.bottle.game;

import java.util.Scanner;

/**
 *
 * @author DAM O DAR
 */
public class BeerBottleGame {
    int bottleNo=21;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        main();
        
    }
    static  void main(){
        
        String introText="Beer Bottle Game";
        
        System.out.print(introText+"\n"+"\u001B[31m"+"..............................................."+"\u001B[0m"+"\n");
        
        System.out.print("\u001B[43m"+"There are 21 beer bottles.."+"\u001B[0m"+"\n");
        
        System.out.print("\u001B[43m"+"There are two players computer and you"+"\u001B[0m"+"\n");
        
        System.out.print("\u001B[43m"+"At a time, each can pick up any number of bottles between 1 and 4 inclusively"+"\u001B[0m"+"\n");
        
        System.out.print("\u001B[31m"+"..............................................."+"\u001B[0m"+"\n");
        
        System.out.print("\u001B[31m"+""+"\u001B[0m");
        
        Scanner sc = new Scanner(System.in);
        
        String playing;
       
        
        do{
           
            System.out.println("\n"+"\u001B[34m"+"Will you like to play first? format (Yes or No)"+"\u001B[0m");
            
            playing = sc.next();
            
        }while(!"Yes".equals(playing) && !"No".equals(playing) && !"no".equals(playing) && !"yes".equals(playing) );
        
        if("Yes".equals(playing) || "yes".equals(playing) ){
            
            System.out.println("Thak you say your number first");
            userFirst();
            
            
        }
        
        else if ("No".equals(playing) || "no".equals(playing)){
            
            System.out.println("Thak you now Computer will choose first");
        
        }
        
    }
    static void ComputerFirst(){
    
    }
    
    static void userFirst(){
        
        int userInput;
        
        
        
        
        int totalBottle = 21;
        
        for(int i=1; i<5; i++){
            Scanner input = new Scanner(System.in);
            
            
            do{

               System.out.println("\n"+"\u001B[34m"+"How many bottle you want to choose between 1 & 4"+"\u001B[0m");

               userInput = input.nextInt();

            }while(userInput > 4 || userInput < 1 );

            System.out.println("You have intered "+userInput);

            int computerInput = 5 - userInput;

            int j = computerInput + userInput;

            System.out.println("Computer has choosen " +" "+computerInput+" "+"bottles");
            
            int b =  totalBottle - 5*i;

            System.out.println("Remaining bottles are"+" "+b);
            
        }
        
        System.out.println("\n"+"Computer has won the game");
        
        String continues;
        
        Scanner coninue = new Scanner(System.in);
        
        System.out.println("\n"+"\u001B[34m"+"Will you like to play again? format (Yes or No)"+"\u001B[0m");
        
        continues = coninue.next();
        
        if("Yes".equals(continues) || "yes".equals(continues)){
            main();
        }
        
        else{
            
        }
//        do{
//            
//            System.out.println("\n"+"\u001B[34m"+"How many bottle you want to choose between 1 & 4"+"\u001B[0m");
//            
//            userInput = input.nextInt();
//            
//        }while(userInput > 4 || userInput < 1 );
//        
//        System.out.println("You have intered "+userInput);
//        
//        int computerInput = 5 - userInput;
//        
//        int j = computerInput + userInput;
//        
//        System.out.println("Computer has choosen " +" "+computerInput+" "+"bottles");
//        
//        for(int i = 21; i>0; i = i- j){
//            
//            System.out.println("Remaining bottles are"+i);
//        
//        }
        
    }
    
}
