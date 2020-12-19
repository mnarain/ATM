package sr.unasat.atm.app;

import sr.unasat.atm.services.ATMService;
import sr.unasat.atm.services.AuthenticationService;

public class Applicatie {

    public static void main(String[] args) {
        AuthenticationService.login("tpique", "123");
    }


}
