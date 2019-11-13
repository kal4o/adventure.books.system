package com.advanced.academy.adventure.books.system.service;

import com.advanced.academy.adventure.books.system.model.adventure.Choice;
import com.advanced.academy.adventure.books.system.model.adventure.Step;
import com.advanced.academy.adventure.books.system.repository.ChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChoiceService {

    private final ChoiceRepository choiceRepository;

    @Autowired
    public ChoiceService(ChoiceRepository choiceRepository) {
        this.choiceRepository = choiceRepository;
    }

    public Choice createOrUpdate(Choice choice) {
        choice.setStepGivenIn(
                choiceRepository.getReference(
                        Step.class,
                        choice.getStepGivenIn().getId()
                )
        );

        choice.setResultInStep(
                choiceRepository.getReference(
                        choice.getResultInStep().getClass(),
                        choice.getResultInStep().getId()

                )

        );
//        choice.setResultInStep(
//                choiceRepository.getReference(
//                        Step.class,
//                        choice.getResultInStep().getId()
//                )
//        );

        Choice result = choiceRepository.save(choice);
        result.setStepGivenIn(null);
        result.setResultInStep(null);
        return result;
    }

}
