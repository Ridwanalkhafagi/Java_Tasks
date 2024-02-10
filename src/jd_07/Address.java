package jd_07;

import org.w3c.dom.ls.LSOutput;

public class Address {

    public int buildNumber;
    public String street;
    public String city;
    public String state;
    public String zipCode;

    public void address1(){
        System.out.println(buildNumber + " " + street
        + " " + state + " " + zipCode);
    }


    public String toString() {
        return "Address{" +
                "buildNumber=" + buildNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

}
