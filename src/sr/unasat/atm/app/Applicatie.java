package sr.unasat.atm.app;

import sr.unasat.atm.services.ATMService;

public class Applicatie {

    public static void main(String[] args) {
        ATMService atmService = new ATMService(3000);
        atmService.snelkas(50);
    }


}
