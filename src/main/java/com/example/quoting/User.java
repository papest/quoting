package com.example.quoting;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.ArrayList;

@Table(name = "User")
public class User {

    @Id
    @Column
    private Long userId;

    @Column
    private String login;

    @MappedCollection(idColumn = "id")
    private ArrayList<Quote> quotes;


    public Long getId() {
        return userId;
    }

    public void setId(Long id) {
        this.userId = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


}
