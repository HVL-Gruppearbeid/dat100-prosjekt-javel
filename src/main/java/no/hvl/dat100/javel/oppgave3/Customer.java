package no.hvl.dat100.javel.oppgave3;

public class Customer {

    // TODO - object variables (attributes)
    String name;
    String email;
    int customer_id;
    PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;

    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }


    public void setCustomer_id(int customer_id){
        this.customer_id = customer_id;
    }
    public int getCustomer_id(){
        return customer_id;
    }


    public void setAgreement(PowerAgreementType agreement){
        this.agreement = agreement;
    }
    public PowerAgreementType getAgreement(){
        return agreement;
    }


    public void printCustomerinfo(Customer person){
        System.out.print("Name: ");
        System.out.println(person.getName());

        System.out.print("Email: ");
        System.out.println(person.getEmail());

        System.out.print("ID: ");
        System.out.println(person.getCustomer_id());

        System.out.print("Agreement: ");
        System.out.println(person.getAgreement());

    }


}
