package com.advanced.academy.adventure.books.system.model;

public class Hero {
    private Integer id;
    private Customer customer;
    private String nickname;
    private Integer reputation;
    private Integer numberOfLives;
    private Adventure adventure;


    public Adventure getAdventure() {
        return adventure;
    }

    public void setAdventure(Adventure adventure) {
        this.adventure = adventure;
    }

    public Integer getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(Integer numberOfLives) {
        this.numberOfLives = numberOfLives;
    }


    public Integer getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

}
