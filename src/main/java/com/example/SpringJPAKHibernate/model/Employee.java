package com.example.SpringJPAKHibernate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "employee")

@Entity
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;

    @Column(name = "noOfChildren")
    private int noOfChildren;

    @Column(name = "spouse")
    private boolean spouse;
    @Column(name = "age")
    private int age;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Address> addressList;


    public Employee(int id, String firstName, String lastName, int noOfChildren, boolean spouse, int age, List<Address> addressList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.noOfChildren = noOfChildren;
        this.spouse = spouse;
        this.age = age;
        this.addressList = addressList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(int noOfChildren) {
        this.noOfChildren = noOfChildren;
    }

    public boolean isSpouse() {
        return spouse;
    }

    public void setSpouse(boolean spouse) {
        this.spouse = spouse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddress() {
        return addressList;
    }

    public void setAddress(List<Address> addresslist) {
        this.addressList = addresslist;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", noOfChildren=" + noOfChildren +
                ", spouse=" + spouse +
                ", age=" + age +
                ", addresslist=" + addressList +
                '}';
    }
}