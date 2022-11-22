import java.util.Scanner;
public class Guess{
   public static void guessgame(){
       Scanner sc=new Scanner(System.in);
       int number=1+(int)(100*Math.random());
       int k=6;
       int i,guess;
       System.out.println("A number is choosen "+"between 1 to 100" +" guess number within 6 trials");
       for( i=0;i<k;i++){
           System.out.println("\tGuess the number:");
           guess=sc.nextInt();
           if(number==guess){
               System.out.println("congratulations!! You are Guess the correct number");
               break;
           }
           else if(number>guess && i!=k-1){
                System.out.println("The number is " +"greater than "+guess+" ");
           }
           else if(number<guess && i!=k-1){
                System.out.println("The number is "+"less than "+guess+" ");
           }
       }
       if(i==k){
          
                System.out.println("You are exhausted"+"K trials");
          System.out.println("number was"+number);
       }
   } 
   public static void main(String args[]){
       guessgame();
   }
}

