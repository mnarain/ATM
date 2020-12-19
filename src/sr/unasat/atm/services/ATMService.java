package sr.unasat.atm.services;

import sr.unasat.atm.entities.User;
import sr.unasat.atm.util.MoneyFormatter;

public class ATMService {
    private static Integer[] snelkasOpties= {50,100,200,400,600,800,1000};

    //maak snelkas keuze
    // controleer of het saldo toereikend is
    // indien saldo niet toereikend toon melding uw saldo is niet toereikend
    // indien saldo wel toereikend, retouneer gevraagd bedrag met correcte melding en update het saldo en geef aan wat over is

    public static void snelkas(int chosenAmount) {
        // controleer of het saldo toereikend is
        if(!isSaldoToereikend(chosenAmount)){
            System.out.println("het saldo is niet toereikend");
            return;
        }

        //ergens in de code de aftrekking doen en het nieuwe saldo tonen

        String message = "Haal uw geld uit het cashvak. U heeft gekozen voor de optie van ";
        switch (chosenAmount){
            case 50:
                message = processRequest(message, 0);
                break;
            case 100:
                message = processRequest(message, 1);
                break;
            case 200:
                message = processRequest(message, 2);
                break;
            case 400:
                message = processRequest(message, 3);
                break;
            case 600:
                message = processRequest(message, 4);
                break;
            case 800:
                message = processRequest(message, 5);
                break;
            case 1000:
                message = processRequest(message, 6);
                break;
            default: message = "Kies aub een snelkas bedrag";
        }
        System.out.println(message);
    }

    private static String processRequest(String message, int i) {
        message += "SRD" + snelkasOpties[i] + ",-";
        message += "\n" + "Het nieuwe saldo is nu " + MoneyFormatter.process(AuthenticationService.loggedInUser.getSaldo() - snelkasOpties[i]);
        AuthenticationService.loggedInUser.setSaldo(AuthenticationService.loggedInUser.getSaldo() - snelkasOpties[i]);
        return message;
    }

    private static boolean  isSaldoToereikend(int chosenAmount) {
        return (AuthenticationService.loggedInUser.getSaldo() - chosenAmount >= 0);
    }

}
