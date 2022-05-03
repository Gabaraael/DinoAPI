package br.com.axolot.animal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.axolot.animal.Dtos.DinoDto;
import br.com.axolot.animal.Service.DinoService;
import br.com.axolot.animal.model.Animal;
import br.com.axolot.animal.model.Dinosaur;

@RestController
@RequestMapping("/dino")
public class DinoController {

    @Autowired
    DinoService DinoService;

    @GetMapping("/test")
    public String imageDino( DinoDto dto) {
        Animal animal = new Dinosaur();
        animal.setLife(dto.getLife());

        return animal.toString();
    }
    

}
