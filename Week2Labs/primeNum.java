//Tito Rivera trivera26@toromail.csudh.edu
import java.util.Scanner;

public class primeNum {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int x = 0;

            System.out.print("Enter a number: ");
            x = keyboard.nextInt();

            boolean bool = isPrime(x);

            System.out.println(bool);

    }

    public static boolean isPrime (int number) {
        boolean newBool = true;

        if ((number>=0 && number<4) || number==5 || number==7){
            newBool = true;
        }
        else if(number%2 ==0 ||number%3 ==0||number%4 ==0||number%5 ==0||number%6 ==0||number%7 ==0||number%8 ==0||number%9 ==0) {
            newBool = false;
        }
        else{
            newBool = true;
        }


        return newBool;

    }

}