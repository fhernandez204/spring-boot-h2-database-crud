package com.api;

import com.api.model.SpaceCraft;
import com.api.repository.SpaceCraftRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import java.util.List;
import java.util.Optional;

import static com.api.mock.SimulationData.createSpaceCraft;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * * Author: Francisco Hernandez
 **/
@DataJpaTest
public class SpaceCraftControllerTestIT {

    @Autowired
    private SpaceCraftRepository repository;

    @Test
    public void whenCreateUserFindByNameThenReturnUser() {
        SpaceCraft spaceCraft= createSpaceCraft();
        SpaceCraft spaceCraftSave = repository.save(spaceCraft);

        // when
        List<SpaceCraft> userFindByNombre = repository.findByTitleContainingIgnoreCase("Speeders");
        // then
        assertThat(userFindByNombre.get(0).getTitle())
                .isEqualTo(spaceCraftSave.getTitle());
    }

    @Test
    public void whenFindByIdThenReturnUser() {
        SpaceCraft spaceCraft= createSpaceCraft();
        SpaceCraft spaceCraftSave = repository.save(spaceCraft);
        // when
        Optional<SpaceCraft> spaceCraftData = repository.findById(spaceCraftSave.getId());
        // then
        assertThat(spaceCraftData.get().getId())
                .isEqualTo(spaceCraftSave.getId());
    }

}
