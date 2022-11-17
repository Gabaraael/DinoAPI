package br.com.axolot.animal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.axolot.animal.dtos.DinoDto;
import br.com.axolot.animal.Service.DinoService;

@RestController
@RequestMapping(path = "/api")
public class DinoController {

    @Autowired
    DinoService dinoService;

    @PostMapping(path = "/dinosaurus")
    public ResponseEntity<?> createDinosaur(@RequestBody DinoDto dinoDto) {

        try {
            dinoService.create(dinoDto);
            return ResponseEntity.ok().body(true);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping(path = "/dinosaurus")
    public List<DinoDto> findAll() {

        return dinoService.findAll();

    }

    @GetMapping(path = "/dinosaurus/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {

        try {

            dinoService.findById(id);
            return ResponseEntity.ok().body(true);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    // @GetMapping(path = "/dinosaurus/{id}")
    // public ResponseEntity<?> deleteDinosaur(@PathVariable Long id) {

    // try {
    // // TODO
    // //
    // https://medium.com/linkit-intecs/rest-resource-naming-best-practices-cbee65f37a62
    // // dinoService..(id);
    // return ResponseEntity.ok().body(true);
    // } catch (Exception e) {
    // return
    // ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    // }
    // }

}
