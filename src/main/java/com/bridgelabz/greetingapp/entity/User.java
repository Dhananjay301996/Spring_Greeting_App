package com.bridgelabz.greetingapp.entity;

public class User {
    private String firstName;
    private String lastName;



    public String getFirstName(){return firstName;}
    public void setFirstName(String fName) {this.firstName = firstName;}


    public String getLastName(){return lastName;}
    public void setLastName(String lName) {this.lastName = lastName;}

//    @Override
//    public String toString() {
//        String str = (firstName != null) ? firstName + " " : "";
//        str += (lastName != null) ? lastName : "";
//        return str.trim();
//    }


    @Override
    public String toString() {
        String str = (firstName != null) ? firstName + " " : "";
        str += (lastName != null) ? lastName : "";
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
