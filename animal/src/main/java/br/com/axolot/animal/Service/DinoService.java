package br.com.axolot.animal.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.axolot.animal.Dtos.DinoDto;
import br.com.axolot.animal.model.Dinosaur;
import br.com.axolot.animal.repository.DinoRepository;

@Service
public class DinoService {

    @Autowired
    DinoRepository dinoRepository;

    public ArrayList<Dinosaur> findAll() {

        return dinoRepository.findAll();

    }

    public void create(DinoDto dinoDto) {
        Dinosaur dino = new Dinosaur();

        try {

            dino.setAttack(dinoDto.getAttack());
            dino.setLife(dinoDto.getLife());
            dino.setName(dinoDto.getName());
            dinoRepository.save(dino);

        } catch (Exception e) {
            throw e;

        }

    }

}
