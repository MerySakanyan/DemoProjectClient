package com.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table
public class User  {
    @Id
    @GeneratedValue
    @JsonProperty
    private int id;

    @JsonProperty
    @Column(unique = true)
    @NotNull
    private String email;

    // @Column(length = 8)
    @JsonProperty
    @NotNull
    private String password;

    @NotNull
    @JsonProperty
    private int amount;

    public User() {
    }

    public User(String email, String password, int amount) {
        this.email = email;
        this.password = password;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                '}';
    }
}



















