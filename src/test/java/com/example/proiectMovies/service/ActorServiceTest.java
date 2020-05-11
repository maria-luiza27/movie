package com.example.proiectMovies.service;

import com.example.proiectMovies.dao.ActorsRepository;
import com.example.proiectMovies.model.Actor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ActorServiceTest {
    @Mock
    private ActorsRepository actorsRepository;

    @InjectMocks
    private ActorService actorService;

    @Test
   public void givenNewActor_whenSavingActor_thenRepositoryIsCalledCorrectly(){
        Actor actor = Actor.builder()
                .id(1)
                .name("Stefan")
                .genre("Masculin")
                .build();

        actorService.addActors(actor);

        verify(actorsRepository, times(1)).save(actor);
    }
}
