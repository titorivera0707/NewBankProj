//Tito Rivera trivera26@toromail.csudh.edu
public class oddNumbers {

    public static void main (String[] args) {

        int check = 0;
        for(int x=0; x < 100; x++){

            check = x % 2;

            if (check == 0) continue;

            System.out.println(x);

        }

    }

}