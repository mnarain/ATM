package sr.unasat.atm.services;

import sr.unasat.atm.entities.User;

public class AuthenticationService {
    public static User loggedInUser;

    public static void login(String username, String password){
        try {
            User user = UserService.findByName(username);
            if(user != null && user.getUsername().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)){
                loggedInUser = user;
                //load snelkas optie
                ATMService.snelkas(100);
                loggedInUser = null;
                System.out.println("U bent succevol uitgelogged");
            }
        } catch (Exception e) {
            System.out.println("Uw inlog gegevens zijn incorrect");
        }
    }
}