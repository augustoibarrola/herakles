package com.herc.hercreader;

public class Person {

    private String lastName;
    private String firstName;

    public Person() { }

    public Person(String lastName, String firstName) {

        this.firstName = firstName;
        this.lastName = lastName;
   
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }




}