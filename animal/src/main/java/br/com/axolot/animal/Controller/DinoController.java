package br.com.axolot.animal.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.axolot.animal.Dtos.DinoDto;
import br.com.axolot.animal.Service.DinoService;
import br.com.axolot.animal.model.Dinosaur;



@RestController
@RequestMapping("/api")
public class DinoController{

    @Autowired
    DinoService dinoService;

    @GetMapping("/dinos")
    public ArrayList<Dinosaur> findAll() {

        return dinoService.findAll();   

    }

    @PostMapping(path= "/dino")    
    public ResponseEntity<?> post(@RequestBody DinoDto dinoDto) {
        
        try {
            dinoService.create(dinoDto);
            return ResponseEntity.ok().body(true);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }

    }
}
