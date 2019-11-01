package com.advanced.academy.adventure.books.system.model;

import com.advanced.academy.adventure.books.system.model.enums.EndGameType;

import java.util.ArrayList;
import java.util.List;

public class Step {
    private Integer id;
    private Integer reputationChange;
    private EndGameType endGameType;
    private boolean endGame = false;
    private String story;

    public Integer getId() {
        return id;
    }

    public Integer getReputationChange() {
        return reputationChange;
    }

    public void setReputationChange(Integer reputationChange) {
        this.reputationChange = reputationChange;
    }

    public EndGameType getEndGameType() {
        return endGameType;
    }

    public void setEndGameType(EndGameType endGameType) {
        this.endGameType = endGameType;
    }

    public boolean isEndGame() {
        return endGame;
    }

    public void setEndGame(boolean endGame) {
        this.endGame = endGame;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public List<Choice> getChoicelist() {
        return choicelist;
    }

    public void setChoicelist(List<Choice> choicelist) {
        this.choicelist = choicelist;
    }

    private List<Choice> choicelist = new ArrayList<>();
}
