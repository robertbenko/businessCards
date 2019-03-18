import java.util.ArrayList;

public class BankAccountBusinessCard extends BusinessCard {

    private String bankAccount;

    public String getBankAccount(){
        return bankAccount;
    }

    public void setBankAccount(){
        this.bankAccount = bankAccount;
    }

    public BankAccountBusinessCard(String name, String surname, int phone, String city, String bankAccount){
        super(name, surname, phone, city);
        this.bankAccount = bankAccount;
    }
    public BankAccountBusinessCard(String name, String surname, String bankAccount){
        super(name, surname);
        this.bankAccount = bankAccount;
    }

    public ArrayList<String> getLines() {
        ArrayList<String> lines = new ArrayList<String>();

        String name = getName();
        String surname = getSurname();
        int phone = getPhone();
        String city = getCity();

        lines.add(name + " " + surname);
        lines.add("tel. " + phone + " adres: " + city);
        lines.add("numer konta " + bankAccount);

        return lines;
    }


}
