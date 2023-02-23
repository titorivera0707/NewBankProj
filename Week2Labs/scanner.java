import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Will read an int
        System.out.print("Enter a number: ");
        int firstNumber = keyboard.nextInt();
        //Will read a double
        System.out.print("Enter another number: ");
        double secondNumber = keyboard.nextDouble();
        //Will read a word
        System.out.print("Enter a word: ");
        String firstChar = keyboard.next();
        //Will read a true or false boolean
        System.out.print("Write true or false: ");
        boolean firstBool = keyboard.nextBoolean();
        //Will read a sentence
        System.out.print("Enter a sentence: ");
        String firstString = keyboard.nextLine();
        //Catches the leftover of the above line
        firstString = keyboard.nextLine();

        System.out.println("You printed: " + firstNumber + ", " + secondNumber + ", " + firstChar + ", " + firstString + ", " + firstBool);        

    }

}