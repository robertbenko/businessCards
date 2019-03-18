public class BusinessCardDemo {

    public static void main(String[] args){
        BusinessCard BC = new BusinessCard("Robert", "Benko", 123456, "Krakow");
        BusinessCard BCBACC = new BankAccountBusinessCard("robert", "ben", 1234, "Otwock", "2222222");
        BusinessCard BC2 = new BusinessCard("Wujku", "Robertu");
        BusinessCard BC3 = new BankAccountBusinessCard("Wujku", "Robertu", "33333333");

        BC.print();
        System.out.println();
        BCBACC.print();
        System.out.println();
        BC2.print();
        System.out.println();
        BC3.print();

    }

}
