package harris_3_strings;
import java.util.Scanner;
import java.util.Random;
public class Harris_3_Strings {
    public static void main(String[] args) {
        Name();
        game();
        end();
    }    
    static int counter;
    static void Name(){
        //playagain = true;     
        System.out.println("What is your Name?");
        Scanner name = new Scanner(System.in);
        String xx = name.nextLine();
        System.out.println("Hello "+ xx + ", my name is Bobby");
    }
    static void end(){
        System.out.println("You Lose");
    }
    static void game(){    
        counter = 7;
        boolean itsaboolean = true;
        while(itsaboolean == true){
            System.out.println("Pick a number between 1 and 10");
            Scanner hh= new Scanner(System.in);
            int a = hh.nextInt(); 
            Random number = new Random();
            int jj = number.nextInt(10);
            if (a == jj){
                System.out.println("Correct");
                itsaboolean = false;
                game();
            }
            if (a != jj){
                System.out.println("Incorrect");
            }
            if (a <= jj){
                System.out.println("To Low");
            }
            if (a >= jj){
                System.out.println("To High");
            }
            while (counter>0){
                counter--;
                end();
            }
            System.out.println("You have "+counter +" tries's left.");
        }       
    }
}
