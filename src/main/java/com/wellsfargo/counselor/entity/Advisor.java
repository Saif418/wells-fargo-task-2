package com.wellsfargo.counselor.entity;
package com.javax.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.presistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Advisor() {
        public Advisor(String firstName, String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
    public String toString()
    {
        return String.format(
                "Advisor[id=%d, firstName='%s', lastName='%s']",
                             id, firstName, lastName);
        )
    }
    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getAdvisorId() {
        return advisorId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// for client

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long ClientId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Client() {
        public Client(String firstName, String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
    public String toString()
    {
        return String.format(
                "Client[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
        )
    }
    public Client(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getClientId() {
        return ClientId;
    }

    public Long getAdvisorId(){return AdvisorId;}

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// for portfolio

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long PortfolioId;

    @Column(nullable = false)
    private Date creationdate = new Date;


    protected Portfolio() {
        public Portfolio(long PortfolioId, Date creationdate)
        {
            this.creationdate = creationdate;
            this.PortfolioId = PortfolioId;
        }
    }
    public String toString()
    {
        return String.format(
                "Portfolio[id=%d, creationdate='%s']",
                id, creationdate);
        )
    }
    public Portfolio(long PortfolioId, Date creationdate) {
        this.PortfolioId = PortfolioId;
        this.creationdate = creationdate;
    }

    public Long getPortfolioId() {
        return PortfolioId;
    }

    public Date getCreationdate() {
        return creationdate;
    }


}

//