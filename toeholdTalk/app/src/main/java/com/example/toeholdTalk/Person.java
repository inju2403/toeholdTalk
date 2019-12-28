package com.example.toeholdTalk;

public class Person implements Comparable<Person> {
    private String name;
    private String phoneNumber;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public String getPhoneNumber() { return this.phoneNumber; }

    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }
}
