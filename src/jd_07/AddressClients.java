package jd_07;

public class AddressClients {

    public static void main(String[] args) {

        Address example1 = new Address();

        example1.buildNumber = 7925;
        example1.street = "Jones Branch Dr";
        example1.city = "McLean";
        example1.state = "VA";
        example1.zipCode = "22012";

        System.out.println(example1.toString());
        example1.address1();




    }
}
