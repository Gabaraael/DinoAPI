package br.com.axolot.animal.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.axolot.animal.model.Dinosaur;

@Repository
public interface DinoRepository extends JpaRepository<Dinosaur, Long> {

    public ArrayList<Dinosaur> findAll();

    public Dinosaur findById();

}
