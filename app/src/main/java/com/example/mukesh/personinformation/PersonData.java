package com.example.mukesh.personinformation;

public class PersonData {

    private Person personData;

    public PersonData(Person personData) {
        this.personData = personData;
    }

    public PersonData() {
        this.personData = new Person("Akhilesh Bhatia",
                "12345",
                "Castlewhite",
                "akhilesh",
                "https://github.com/akhileshbhatia");

    }

    public Person getPersonData() {
        return personData;
    }

    public void setPersonData(Person personData) {
        this.personData = personData;
    }
}
