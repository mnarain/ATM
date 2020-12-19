package sr.unasat.atm.entities;

public class User {
    private String username;
    private String password;
    private String naam;
    private String bankaccount;
    private double saldo;

    public User(String username, String password, String naam, String bankaccount, double saldo) {
        this.username = username;
        this.password = password;
        this.naam = naam;
        this.bankaccount = bankaccount;
        this.saldo = saldo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", naam='" + naam + '\'' +
                ", bankaccount='" + bankaccount + '\'' +
                ", saldo='" + saldo + '\'' +
                '}';
    }
}
