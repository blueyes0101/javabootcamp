package j8Scanner;

import java.util.Scanner;
public class Scann {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben sie ihr alter ein:");

        int alter = scanner.nextInt();

        //double alt = scanner.nextDouble();

        System.out.println("dein Alter :" + alter);


        /* 
        System.out.println("Bitte geben Sie Text ein");
        String text = scanner.nextLine();
        System.out.println("Sie schrieben: " + text); 
        */


        /* 
        if (scanner.hasNextInt()){
            int nummer = scanner.nextInt();
            System.out.println("nummer " + nummer);
        }
        else{
            System.out.println("Bitte Nummer eingeben");
        } 
        */
    }
}
