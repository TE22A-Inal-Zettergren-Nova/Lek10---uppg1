import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.print("Skriv in ditt användarnamn: ");
        String user = tb.nextLine();
        System.out.print("Skriv in ditt lösenord: ");
        String passwrd = tb.nextLine();
        

        if (user.equals("root") && passwrd.equals("pass")) {
            System.out.println("Ditt bankkonto har 0 kr");
        }
        else{
            System.out.println("Fel användarnamn eller lösenord");
        }

        //uppgift b//
        System.out.print("Skriv in ett tal: ");
        int tal = tb.nextInt();

        if (tal>10) {
            System.out.println("Talet är större än 10");
        }
        else{
            System.out.println("Talet är mindre eller lika med 10");
        }

        }
        


    }



