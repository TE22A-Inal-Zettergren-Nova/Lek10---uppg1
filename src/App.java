import java.util.Scanner;

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
            System.out.println("Fel användarnamn");
        }
        }

    }



