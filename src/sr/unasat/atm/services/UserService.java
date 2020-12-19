package sr.unasat.atm.services;

import sr.unasat.atm.entities.User;

import java.util.List;
import java.util.Optional;

public class UserService {
    private static List<User> userList = List.of(
            new User("tpique", "1234", "Terrence Pique", "673892", 5000),
            new User("yhasselbank", "1234", "Yvonnen Hasselbank", "938474", 6200),
            new User("raida", "1234", "Revish Aida", "65357", 10000)
    );

    private UserService() {
    }

    public static List<User> loadUsers() {
        return userList;
    }

    public static User findByName(String username) throws Exception {
        Optional<User> userfound = userList.stream().filter(user -> user.getUsername().equalsIgnoreCase(username)).findFirst();
        return userfound.orElseThrow(() -> new Exception("Uw inlog gegevens zijn incorrect!"));
    }

/*    public static User findByNameOldWay(String username) throws Exception {
        for (User user : userList) {
            filter(user, username);
        }
        throw new Exception();
    }


    public static  User filter(User user, String username) {
        if (user.getUsername().equalsIgnoreCase(username)) {
            return user;
        }
        return null;
    }*/

}
