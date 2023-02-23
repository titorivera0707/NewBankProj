//Tito Rivera trivera26@toromail.csudh.edu
import java.util.Scanner;

public class userEnter {
    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int x = 0;

        do{

            System.out.print("Enter a number: ");
            x = keyboard.nextInt();

            if(x == -1) break;
            else{
                System.out.println("You entered: " + x);
            }

        }while(x!=-1);

    }

}