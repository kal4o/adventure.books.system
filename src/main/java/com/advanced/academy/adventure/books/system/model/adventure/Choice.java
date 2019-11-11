package com.advanced.academy.adventure.books.system.model.adventure;

import javax.persistence.*;

@Entity
@Table(name = "choice")
public class Choice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "description")
    private String description;


    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "step_given_in")
    private Step stepGivenIn;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "result_in_step_id")
    private Step resultInStep;


    @Column(name = "reputation_change")
    private Integer reputationChange;

    public Integer getReputationChange() {
        return reputationChange;
    }

    public void setReputationChange(Integer reputationChange) {
        this.reputationChange = reputationChange;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Step getStepGivenIn() {
        return stepGivenIn;
    }

    public void setStepGivenIn(Step stepGivenIn) {
        this.stepGivenIn = stepGivenIn;
    }

    public Step getResultInStep() {
        return resultInStep;
    }

    public void setResultInStep(Step resultInStep) {
        this.resultInStep = resultInStep;
    }
}
