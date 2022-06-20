package br.com.axolot.animal.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.axolot.animal.Dtos.DinoDto;
import br.com.axolot.animal.model.Dinosaur;
import br.com.axolot.animal.repository.DinoRepository;

@Service
public class DinoService {

    @Autowired
    DinoRepository dinoRepository;

    public List<DinoDto> findAll() {
        ModelMapper modelMapper = new ModelMapper();

        List<DinoDto> dinoDtos = dinoRepository.findAll()
                .stream()
                .map(dino -> modelMapper.map(dino, DinoDto.class))
                .collect(Collectors.toList());
        return dinoDtos;

    }

    public void create(DinoDto dinoDto) {
        ModelMapper modelMapper = new ModelMapper();
        Dinosaur dino = modelMapper.map(dinoDto, Dinosaur.class);

        try {
            dinoRepository.save(dino);

        } catch (Exception e) {
            throw e;

        }

    }

}
