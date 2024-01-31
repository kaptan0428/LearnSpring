package com.example.SpringJPAKHibernate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // mark a java class as an entity, which is a table in DB
@Table(name = "address") //  table name in DB
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id // to make it primary id
    @GeneratedValue // automatic id will be generated
    @Column(name = "addressID" ) // column name in db
    private int addressID;
    @Column(name="streetAddress")
    private String streetAddress;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
    @Column(name = "postalCode")
    private String postalCode;

//    public int getId() {
//        return addressID;
//    }
//
//    public void setId(int addressID) {
//        this.addressID = addressID;
//    }
//
//    public String getStreetAddress() {
//        return streetAddress;
//    }
//
//    public void setStreetAddress(String streetAddress) {
//        this.streetAddress = streetAddress;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getPostalCode() {
//        return postalCode;
//    }
//
//    public void setPostalCode(String postalCode) {
//        this.postalCode = postalCode;
//    }

//    @Override
//    public String toString() {
//        return "Address{" +
//                "addressID=" + addressID +
//                ", streetAddress='" + streetAddress + '\'' +
//                ", city='" + city + '\'' +
//                ", state='" + state + '\'' +
//                ", country='" + country + '\'' +
//                ", postalCode='" + postalCode + '\'' +
//                '}';
//    }

//    public Address(int addressID, String streetAddress, String city, String state, String country, String postalCode) {
//        this.addressID = addressID;
//        this.streetAddress = streetAddress;
//        this.city = city;
//        this.state = state;
//        this.country = country;
//        this.postalCode = postalCode;
//    }
    //    private Employee employee;
}