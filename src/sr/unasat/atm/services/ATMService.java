package sr.unasat.atm.services;

public class ATMService {
    private static Integer[] snelkasOpties= {50,100,200,400,600,800,1000};

    public void snelkas(int chosenAmount) {
        String message = "Haal uw geld uit het cashvak. U heeft gekozen voor de optie van ";
        switch (chosenAmount){
            case 50: message += "SRD" + snelkasOpties[0]+ ",-";
                break;
            case 100: message += "SRD" + snelkasOpties[1]+ ",-";
                break;
            case 200: message += "SRD" + snelkasOpties[2]+ ",-";
                break;
            case 400: message += "SRD" + snelkasOpties[3] + ",-";
                break;
            case 600: message += "SRD" + snelkasOpties[4]+ ",-";
                break;
            case 800: message += "SRD" + snelkasOpties[5]+ ",-";
                break;
            case 1000: message += "SRD" + snelkasOpties[6]+ ",-";
                break;
            default: message = "Kies aub een snelkas bedrag";
        }
        System.out.println(message);
    }

}
